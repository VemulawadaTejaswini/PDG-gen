import java.util.Arrays;
import java.util.Scanner;

public class Main {

   void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            max = Math.max(max, A[i]);
        }

       int[] work = Arrays.copyOf(A, A.length);
       Arrays.sort(work);

       // Max が複数個あったら、どれを省いても出力はmaxにすべき。
       if (work[N - 1] == work[N - 2]) {
           for (int i = 0; i < N; i++) {
                System.out.println(max);
           }
           return;
       }

       // Max が一個しかなかったら、出力はmaxかnextMaxのどちらか。
       // なので、ここでnextMaxを求める。
       int nextMax = 0;
       for (int i = N - 1; i > 0; i--) {
            if (work[i] != work[i - 1]) {
                nextMax = work[i - 1];
                break;
            }
        }

       for (int i = 0; i < N; i++) {
           if (A[i] == max) {
               System.out.println(nextMax);
           }
           else {
               System.out.println(max);
           }
       }


    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

