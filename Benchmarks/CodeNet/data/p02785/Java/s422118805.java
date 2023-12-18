import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    // no self-loop or multiple edges
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        sc.close();
        Arrays.sort(a);
        long ans = 0;
        for(int i=0;i<n-k;i++){
            ans += a[i];
        }
        return ans;
    }
}

