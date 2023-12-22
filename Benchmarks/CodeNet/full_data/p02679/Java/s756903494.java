import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long W = Long.MAX_VALUE/3;
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
    }
    void solve() throws IOException {
        int n = sc.nextInt();
        long[] A = new long[n], B = new long[n];
        int zeroA = 0, zeroB = 0;
        Map<String, Integer> pos = new HashMap<>(n/2+1), neg = new HashMap<>(n/2+1);
        for(int i=0;i<n;i++){
            A[i] = sc.nextLong(); B[i] = sc.nextLong();
            if(A[i]==0&&B[i]==0) continue;
            else if(A[i]==0){
                zeroA++;
            } else if(B[i]==0){
                zeroB++;
            } else{
                long a = Math.abs(A[i]), b = Math.abs(B[i]);
                long g = gcd(a,b);
                a /= g; b /= g;
                Map<String, Integer> map = neg;
                if((A[i]>0&&B[i]>0)||(A[i]<0&&B[i]<0)) map = pos;
                String key = makeKey(a,b);
                Integer val = map.get(key);
                if(val==null) val = 1;
                else val += 1;
                map.put(key,val);
            }
        }
        String[] buf;
        long ans = 1;
        ans = ans*(power(2,zeroA)+power(2,zeroB)-1)%mod;
        for(Map.Entry<String,Integer> e:pos.entrySet()){
            int p = e.getValue();
            buf = e.getKey().split(" ");
            String kk = buf[1]+" "+buf[0];
            int q = neg.getOrDefault(kk,0);
            neg.remove(kk);
            long cur = power(2,p)+power(2,q)-1;
            ans = ans*cur%mod;
        }
        for(Map.Entry<String,Integer> e:neg.entrySet()){
            int q = e.getValue();
            long cur = power(2,q); // no -1 here
            ans = ans*cur%mod;
        }
        ans = (ans-1+mod)%mod;
        out.println(ans);

    }
    long gcd(long a, long b){
        if(a==0||b==0) return 1;
        if(a<b){
            long c= a; a = b; b = c;
        }
        while(a%b!=0){
            long c = b; b = a%b; a = c;
        }
        return b;
    }
    long power(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%mod;
            base = base*base%mod;
            p /= 2;
        }
        return ans;
    }
    String makeKey(long first, long second){
        return String.format("%d %d",first,second);
    }
}