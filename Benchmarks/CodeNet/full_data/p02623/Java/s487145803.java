import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 机A, Bそれぞれに積まれた本の数、制限時間を変数に格納する
        int bookCntA = console.nextInt();
        int bookCntB = console.nextInt();
        long limitMin = console.nextLong();
        console.nextLine();

        int booksReadAOnly = 0;
        int booksReadBOnly = 0;

        List<Long> aBooks = new ArrayList<Long>(bookCntA + 1);
        aBooks.add(0L);
        for (int i = 1; i <= bookCntA; i++) {
            long min = aBooks.get(i-1) + console.nextLong();
            if(min <= limitMin) {
                aBooks.add(min);
                booksReadAOnly = i;
            }else{
                break;
            }
        }
        console.nextLine();

        List<Long> bBooks = new ArrayList<>(bookCntB + 1);
        bBooks.add(0L);
        for (int i = 1; i <= bookCntB; i++) {
            long min = bBooks.get(i-1) + console.nextLong();
            if(min <= limitMin) {
                bBooks.add(min);
                booksReadBOnly = i;
            }else{
                break;
            }
        }
        console.nextLine();

        // 全パターンで検証する
        long limitMinTemp = limitMin;
        int answer = 0;
        for(int readA = 0; readA <= booksReadAOnly; readA++){
            limitMinTemp = limitMin;
            int bookCnt = 0;
            limitMinTemp -= aBooks.get(readA);
            bookCnt += readA;

            for(int readB = 0; readB <= booksReadBOnly; readB++){
                long bBookMin = bBooks.get(readB);
                if(limitMinTemp < bBookMin) {
                    break;
                }else if(limitMinTemp >= bBookMin && (readB == booksReadBOnly)){
                    bookCnt += readB;
                    break;
                }else if(limitMinTemp < bBooks.get(readB + 1)){
                    bookCnt += readB;
                    break;
                } else if(limitMinTemp >= bBooks.get(readB + 1)){
                    continue;
                }
            }
            answer = bookCnt;
        }

        // 結果をプリント
        System.out.println(answer);
    }
}
