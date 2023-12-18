import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), K = sc.nextInt(), q = sc.nextInt();
        int[] rec = new int[n];
        for(int i=0;i<q;i++){
            int a = sc.nextInt()-1;
            rec[a] += 1;
        }
        int ref = q-K;
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<n;i++){
            if(rec[i]>ref) out.println("Yes");
            else out.println("No");
        }
        out.flush();
        long ans = 1;
        return ans;
    }
}

