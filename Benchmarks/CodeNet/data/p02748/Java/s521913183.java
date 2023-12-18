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
        int[] rawCost = new int[Math.min(A,B)];
        int[] rawCostD = new int[M];
        for(int z = 0; z<Math.min(A,B); z++){
                rawCost[z] = a[z]+b[z];
        }
        for(int z =0; z<M; z++){
            rawCostD[z] = a[x[z]-1]+b[y[z]-1]-c[z];
        }
        Arrays.sort(rawCost);
        Arrays.sort(rawCostD);
        System.out.println(Math.min(rawCost[0],rawCostD[0]));
    }

}
