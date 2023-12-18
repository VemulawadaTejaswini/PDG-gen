import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        int M = 0;
        for (int i=1; i<N/2+1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=N/2+1; i<N+1; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
            if(b[i] == 1) {
                M += 1;
            }
        }
        for (int i=N/2; i>0; i--) {
            int k = 0;
            for (int j=2*i; j<N+1; j+=i) {
                k += b[j];
            }
            if(a[i] == 0) {
                if (k % 2 == 0) {
                   b[i] = 0;
                } else {
                    b[i] = 1;
                }
            } else {
                if (k % 2 == 0) {
                   b[i] = 1;
                } else {
                   b[i] = 0;
                }
            }

            if(b[i] == 1) {
                M += 1;
            }
        }
        System.out.println(M);
        if (M > 0) {
            for (int i=1; i<N+1; i++) {
                if (b[i] == 1) {
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
    }
}