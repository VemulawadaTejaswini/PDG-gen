import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        int out = 0;
        for(int i = 0; i <= 100000; i++){
            int c = 0;
            for(int j = 0; j < n; j++){
                if(Math.abs(a[j] - i) <= 1) c++;
            }
            out = Math.max(out, c);
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
