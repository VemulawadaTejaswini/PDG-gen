import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] num = new int[100010];
        long sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            num[a[i]]++;
            sum += a[i];
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            int b = scan.nextInt();
            int c = scan.nextInt();
            sum += num[b] * (c - b);
            num[c] += num[b];
            num[b] = 0;
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
