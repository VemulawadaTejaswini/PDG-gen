import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        long[] b = new long[n];
        long out = 0;
        for(int i = 0; i < n; i++){
            b[i] = sum;
            sum -= a[i];
            System.out.println(a[i] + " " + (b[i] - a[i]));
            out += (a[i] * (b[i] - a[i]));
        }
        System.out.println(out % 1000000007);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
