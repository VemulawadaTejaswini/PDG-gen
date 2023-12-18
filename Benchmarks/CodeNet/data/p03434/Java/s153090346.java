import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int tmp;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if ( a[j] < a[j+1] ) {
                    tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < N; i++) {
            if (i%2 == 0) {
                aliceSum += a[i];
            } else {
                bobSum += a[i];
            }
        }
        System.out.println(aliceSum - bobSum);
    }
}
