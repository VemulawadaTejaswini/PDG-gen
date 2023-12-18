import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] in = new int[n];
        int[] culmitiveSum = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            in[i] = Integer.parseInt(sc.next());
            sum += in[i];
            culmitiveSum[i] = sum;
        }
        int total = culmitiveSum[n-1];
        int t = culmitiveSum[0];
        int a = total - t;
        int min = Math.abs(t-a);
        for(int i=1;i<n-1;i++){
            t = culmitiveSum[i];
            a = total - t;
            min = Math.min(min, Math.abs(t-a));
        }
        System.out.println(min);
    }
}