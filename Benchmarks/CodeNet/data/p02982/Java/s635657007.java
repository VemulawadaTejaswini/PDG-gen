import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int D = Integer.parseInt(sc.next());
        final int A[][] = new int[N][D];
        for (int i=0; i<N; i++) {
            for (int j=0; j<D; j++)
                A[i][j] =  Integer.parseInt(sc.next());
        }
        sc.close();

        int cnt = 0;
        long sum = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                sum = 0;
                for (int k=0; k<D; k++) {
                    sum += Math.pow(A[i][k]-A[j][k], 2);
                }
                int d1 = (int)Math.sqrt(sum);
                if ((int)sum==(int)Math.pow((double)d1, 2))
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}