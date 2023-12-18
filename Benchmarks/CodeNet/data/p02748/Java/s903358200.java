import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[A];
        for(int x =0;x<A;x++){
            a[x] = scanner.nextInt();
        }
        int[] b = new int[B];
        for(int x =0;x<B;x++){
            b[x] = scanner.nextInt();
        }
        int x[] = new int[M];
        int y[] = new int[M];
        int c[] = new int[M];
        for(int X =0;X<M;X++){
            x[X] = scanner.nextInt();
            y[X] = scanner.nextInt();
            c[X] = scanner.nextInt();
        }
        int min = 999999999;
        int minD = 999999999;
        for(int z = 0; z<M; z++){
            if(z<A && z<B) {
                min = Math.min(min, a[z] + b[z]);
            }
            minD = Math.min(minD, a[x[z]-1] + b[y[z]-1] - c[z]);
        }
        System.out.println(Math.min(min,minD));




    }

}
