import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        long out = 0;
        for(int i = 1; i < n; i++){
            if(a[i - 1] > a[i]){
                out += a[i - 1] - a[i];
                a[i] += a[i - 1] - a[i];
            }
        }
        System.out.println(out);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}