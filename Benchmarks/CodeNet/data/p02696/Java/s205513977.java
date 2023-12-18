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

        int aB = (A/B);
        int min = (int)Math.floor(N/B);

        for (int x = N; x >= 0; x--) {
            int t = (int) Math.floor(x *aB);
            int q = (A * (int)Math.floor(x / B));
            if(q>min){
                break;
            }

            int n = t-q;
            if (n > max)
                max = n;
            //System.out.print("x=" + x + " ");
            //System.out.println("n="+n);
            //System.out.println("Math.floor(A*x/B)=" +Math.floor(A * x / B) );
            //System.out.println("A * Math.floor(x/B)=" +(A * (int)Math.floor(x / B)) );

        }
       // System.out.println();
        System.out.println(max);


    }



}
