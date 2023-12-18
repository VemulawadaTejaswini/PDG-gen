import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] in = new long[n];
        long[] culmitiveSum = new long[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            in[i] = Long.parseLong(sc.next());
            sum += in[i];
            culmitiveSum[i] = sum;
        }
        long total = culmitiveSum[n-1];
        long t = culmitiveSum[0];
        long a = total - t;
        long min = Math.abs(t-a);
        for(int i=1;i<n-1;i++){
            t = culmitiveSum[i];
            a = total - t;
            min = Math.min(min, Math.abs(t-a));
        }
        System.out.println(min);
    }
}