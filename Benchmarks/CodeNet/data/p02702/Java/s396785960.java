import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 2019;
    int[] child,color,count;
    long[] res;
    ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        out.println(main.solve());
        out.flush();
    }
    long solve(){
        String s = sc.next();
        char[] arr = s.toCharArray(); // arr[i] is '1'-'9'
        int n = arr.length;
        if(n<4) return 0;
        HashMap<Long,Integer> map = new HashMap<>(2020);
        long base = 1;
        long[] num = new long[n+1];
        for(int i=n-1;i>=0;i--){
            long cur = arr[i]-'0';
            num[i] = (num[i+1]+cur*base%mod)%mod;
            base = base*10%mod;
        }
        long ans = 0;
        for(int i=n-4;i>=0;i--){
            map.put(num[i+4], map.getOrDefault(num[i+4],0)+1);
            ans += map.getOrDefault(num[i],0);
        }
        return ans;
    }

}

