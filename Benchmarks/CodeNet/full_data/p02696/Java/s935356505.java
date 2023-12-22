import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        int A =  s.scan.nextInt();
        int M =  s.scan.nextInt();
        int Q =  s.scan.nextInt();

       int[][] nums = new int[Q][N];
       */

        s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int N = s.nextInt();
        int max = 0;

        for (int x = N; x >= 0; x--) {
            int n = (int) Math.floor(A * x / B) - (int) (A * Math.floor(x / B));
            if (n > max)
                max = n;
        }
        System.out.println(max);


    }



}
