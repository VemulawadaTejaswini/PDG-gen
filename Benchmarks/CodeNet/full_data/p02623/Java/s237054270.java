import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for (int i = 0; i < N; i++) {A[i] = Integer.parseInt(sc.next());}
        for (int i = 0; i < M; i++) {B[i] = Integer.parseInt(sc.next());}

        long sumTime = 0;
        int book = 0;
        int maxBook = 0;
        for (int n = 0; n <= N; n++) {
            book = 0;
            sumTime = 0;
            for (int i = 0; i < n; i++) {
                if (sumTime <= K) {
                    sumTime += (long) A[i];
                    book += 1;
                } else {
                  book -= 1;
                  break;
                }
            }
            for (int m = 0; m <= M; m++) {
                for (int i = 0; i < m; i++) {
                    if (sumTime <= K) {
                        sumTime += (long) B[i];
                        book += 1;
                    } else {
                      book -= 1;
                      break;
                    }
                }
            }
            if (maxBook < book) {maxBook = book;}
        }


        System.out.println(maxBook);

    }
}