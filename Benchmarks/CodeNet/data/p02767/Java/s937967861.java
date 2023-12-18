import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++) x[i] = scan.nextInt();
        int out = Integer.MAX_VALUE;
        for(int i = 1; i <= 100; i++){
            int c = 0;
            for(int j = 0; j < n; j++){
                c += (x[j] - i) * (x[i] - j);
            }
            out = Math.min(out, c);
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
