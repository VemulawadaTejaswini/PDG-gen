import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[][] A;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new long[N][N - 1];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    A[i][j] = sc.nextLong();
                }
            }
        }
        long result = 0;
        Deque<Long>[] list = new Deque[N];
        for (int i = 0; i < N; i++) {
            Deque<Long> target = new LinkedList<>();
            list[i] = target;
            for (int j = 0; j < N - 1; j++) {
                target.add(A[i][j]);
            }
        }


        long game = 0;
        long maxGame = (N * (N-1))/2;

        long days = 1;
        while (true) {
            //初期化
            boolean[] arr = new boolean[N];

            //とある日の組み合わせ
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == true) {
                    continue;
                }

                Long aObj = list[i].peek();
                if(aObj == null){
                    arr[i] = true;
                    continue;
                }

                long a = aObj;
                int ai = (int)a-1;

                if(arr[ai] ==true){
                    continue;
                }

                Long bObj = list[ai].peek();
                if(bObj == null){
                    arr[ai] = true;
                    continue;
                }
                long b = bObj;
                int bi = (int)b-1;

                if (i == bi) {
                    list[i].poll();
                    list[ai].poll();
                    cnt++;
                    game++;
                    arr[i] = true;
                    arr[ai] = true;
                } else {
                    arr[i] = true;
                }
            }

            if(maxGame == game){
                System.out.println(days);
                break;
            }
            if(cnt == 0){
                System.out.println(-1);
                break;
            }
            days++;
        }
    }
}
