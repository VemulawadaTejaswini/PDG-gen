import java.io.*;
import java.util.*;

public class Main{
    PrintWriter out = new PrintWriter(System.out);
    int ans = 1, H, W;
    char[][] maze;
    int[] dr = new int[]{1,0,-1,0}, dc = new int[]{0,1,0,-1};
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        Set<Long> as = PrimeDivisors(a), bs = PrimeDivisors(b);
        int ans = 0;
        for(long s:as){
            if(bs.contains(s)) ans += 1;
        }
        return ans;
    }
    Set<Long> PrimeDivisors(long x){
        Set<Long> ans = new HashSet<>();
        ans.add(1L);
        for(long i=2;i*i<=x;i++){
            if(x%i!=0) continue;
            ans.add(i);
            while(x>=i&&x%i==0) x /= i;
        }
        ans.add(x);
        return ans;
    }

}

