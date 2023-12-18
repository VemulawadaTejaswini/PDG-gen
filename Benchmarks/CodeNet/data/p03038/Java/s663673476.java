import java.util.Arrays;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        long[] a = new long[n];
        int[] b = new int[m];
        long[] c = new long[m];

        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        for(int i=0; i<m; i++){
            b[i] = stdIn.nextInt();
            c[i] = stdIn.nextInt();
        }

        int plusidx = 0;
        for(int i=0; i<b.length; i++){
            plusidx += b[i];
        }

        long[] delta = new long[n];
        for(int i=0; i<n; i++){
            delta[i] = a[i];
        }

        long[] ganma = new long[plusidx];
        int idx = 0;
        for(int i=0; i<b.length; i++){
            for(int kaisuu = 0; kaisuu<b[i]; kaisuu++){
                ganma[idx] = c[i];
                idx++;
            }
        }

        long[] ketugou = new long [delta.length + ganma.length];
        System.arraycopy(delta, 0, ketugou, 0, delta.length);
        System.arraycopy(ganma, 0, ketugou, delta.length, ganma.length);

        Arrays.sort(ketugou);

        long sum = 0;

        for(int i=0; i<n; i++){
            sum += ketugou[ketugou.length-1-i];
        }

        System.out.println(sum);
    }
}