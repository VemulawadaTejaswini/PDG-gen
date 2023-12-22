import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 机A, Bそれぞれに積まれた本の数、制限時間を変数に格納する
        int bookCntA = console.nextInt();
        int bookCntB = console.nextInt();
        long limitMin = console.nextLong();
        console.nextLine();

        // 机Aに積まれている本の数を配列に格納する
        List<Long> aBooks = new ArrayList<Long>(bookCntA);
        for (int i = 0; i < bookCntA; i++) {
            aBooks.add(console.nextLong());
        }
        console.nextLine();

        // 机Bに積まれている本の数を配列に格納する
        List<Long> bBooks = new ArrayList<>(bookCntB);
        for (int i = 0; i < bookCntB; i++) {
            bBooks.add(console.nextLong());
        }

        // 机Aに積まれている本をすべて読むことを想定する
        int booksReadAOnly = 0;
        long limitMinTemp = limitMin;
        for (int i = 0; i < bookCntA; i++){
            long bookMin = aBooks.get(i);
            if(limitMinTemp - bookMin >= 0){
                limitMinTemp -= bookMin;
                booksReadAOnly++;
            } else {
                break;
            }
        }

        // 全パターンで検証する
        int answer = 0;
        for(int readA = 1; readA <= booksReadAOnly; readA++){
            limitMinTemp = limitMin;
            int bookCnt = 0;
            for(int i = 0; i < readA; i++){
                limitMinTemp -= aBooks.get(i);
                bookCnt++;
            }
            
            for(int j = 0; j < bookCntB; j++){
                long bBookMin = bBooks.get(j);
                if(limitMinTemp >= bBookMin){
                    limitMinTemp -= bBookMin;
                    bookCnt++;
                }else{
                    break;
                }
            }
            if(answer < bookCnt){
                answer = bookCnt;
            }
        }

        // 結果をアウトプット
        System.out.println(answer);
    }
}
