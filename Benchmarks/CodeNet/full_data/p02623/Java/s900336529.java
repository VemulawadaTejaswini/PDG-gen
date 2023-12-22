import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 机A, Bそれぞれに積まれた本の数、制限時間を変数に格納する
        int bookCntA = console.nextInt();
        int bookCntB = console.nextInt();
        int limitMin = console.nextInt();
        console.nextLine();

        // 机Aに積まれている本の数をキューに格納する
        Queue<Integer> aBooks = new ArrayDeque<>(bookCntA);
        for (int i = 0; i < bookCntA; i++) {
            aBooks.add(console.nextInt());
        }
        console.nextLine();

        // 机Bに積まれている本の数をキューに格納する
        Queue<Integer> bBooks = new ArrayDeque<>(bookCntB);
        for (int i = 0; i < bookCntB; i++) {
            bBooks.add(console.nextInt());
        }

        // 机Aに積まれている本をすべて読むことを想定する
        int booksReadAOnly = 0;
        Queue<Integer> aBooksTemp = new ArrayDeque<>(bookCntA);
        int limitMinTempA = limitMin;
        aBooksTemp = ((ArrayDeque<Integer>)aBooks).clone();
        for (int i = 0; i < bookCntA; i++){
            int bookMin = aBooksTemp.peek();
            if(limitMinTempA - bookMin >= 0){
                limitMinTempA -= bookMin;
                aBooksTemp.poll();
                booksReadAOnly++;
            } else {
                break;
            }
        }
        aBooksTemp = ((ArrayDeque<Integer>)aBooks).clone();

        // 机Bに積まれている本をすべて読むことを想定する
        int booksReadBOnly = 0;
        Queue<Integer> bBooksTemp = new ArrayDeque<>(bookCntB);
        int limitMinTempB = limitMin;
        bBooksTemp = ((ArrayDeque<Integer>)bBooks).clone();
        for (int i = 0; i < bookCntB; i++){
            int bookMin = bBooksTemp.peek();
            if(limitMinTempB - bookMin >= 0){
                limitMinTempB -= bookMin;
                bBooksTemp.poll();
                booksReadBOnly++;
            } else {
                break;
            }
        }
        bBooksTemp = ((ArrayDeque<Integer>)bBooks).clone();

        // 読むことが可能な数の本だけ机に残す
        Queue<Integer> aBooksNeeded = new ArrayDeque<>(booksReadAOnly);
        Queue<Integer> bBooksNeeded = new ArrayDeque<>(booksReadBOnly);
        for(int i = 0; i < booksReadAOnly; i++){
            aBooksNeeded.add(aBooksTemp.peek());
            aBooksTemp.poll();
        }
        for(int i = 0; i < booksReadBOnly; i++){
            bBooksNeeded.add(bBooksTemp.peek());
            bBooksTemp.poll();
        }

        // 全パターンで検証する（readA = 読む机Aの本の数）
        List<Integer> list = new ArrayList<>();
        int readAMax = aBooksNeeded.size();
        for(int readA = 1; readA <= readAMax; readA++){
            aBooksTemp = ((ArrayDeque<Integer>)aBooks).clone();
            bBooksTemp = ((ArrayDeque<Integer>)bBooks).clone();
            int limitMinTemp = limitMin;
            int bookCnt = 0;

            for(int i = 0; i < readA; i++){
                limitMinTemp -= aBooksTemp.peek();
                aBooksTemp.poll();
                bookCnt++;
            }
            int readBMax = bBooksNeeded.size();
            for(int j = 0; j < readBMax; j++){
                int bBookMin = bBooksTemp.peek();
                if(limitMinTemp >= bBookMin){
                    limitMinTemp -= bBookMin;
                    bBooksTemp.poll();
                    bookCnt++;
                }else{
                    break;
                }
            }
            list.add(bookCnt);
        }

        Integer answer = Collections.max(list);
        System.out.println(answer);
    }
}
