import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int[] a;
    long[] c;
    public void solve(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n + 1];
        c = new long[n + 1];
        int[] b = new int[n + 1];
        Arrays.fill(b, -1);
        int x = 0, y = 0, offset;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(b[a[i]] == -1){
                b[a[i]] = i;
            }else{
                x = b[a[i]];
                y = i;
            }
        }
        offset = x + (n - y) + 1;
        for(int i = 1; i <= n + 1; i++){
            long ans = calc(n + 1, i);
            if(i == 1){
                System.out.println(n);
            }else if(1 < i && i < offset){
                System.out.println(ans - offset);
            }else if(i == offset){
                System.out.println(ans - 1);
            }else{
                System.out.println(ans);
            }
        }
    }


    public long calc(int a, int b){
        long ans = 1;
        if(b > a / 2){
            b = a - b;
        }
        if(c[b] != 0){
            return c[b];
        }
        if(b == 0) return 1;
        for(int i = 1 ; i <=b; i++){
            ans = ans * (a - i + 1) / i;
        }

        c[b] = ans % 1000000007;
        return c[b];
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
