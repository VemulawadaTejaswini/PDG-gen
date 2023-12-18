import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Z = new int[N];
        double A = 0;
        int n = 0;
        int m = 0;
        for(n = 0; n < N; n++) {
            Z[n] = sc.nextInt();
        }

        while(m < N) {
            double i = (double)1/(double)Z[m];
            A = A + i;
            m++;
        }
        System.out.println((double)(1/A));
    }
}