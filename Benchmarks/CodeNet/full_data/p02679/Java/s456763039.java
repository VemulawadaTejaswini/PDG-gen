import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
    }
    void solve() throws IOException {
        int n = sc.nextInt();
        long[] A = new long[n], B = new long[n];
        int zeroA = 0, zeroB = 0, both = 0;
        Map<String, Integer> pos = new HashMap<>(n/2+1), neg = new HashMap<>(n/2+1);
        Map<Long,Map<Long,Integer>> posi = new TreeMap<>(), nega = new TreeMap<>();
        for(int i=0;i<n;i++){
            A[i] = sc.nextLong(); B[i] = sc.nextLong();
            if(A[i]==0&&B[i]==0) both++;
            else if(A[i]==0){
                zeroA++;
            } else if(B[i]==0){
                zeroB++;
            } else{
                long a = Math.abs(A[i]), b = Math.abs(B[i]);
                long g = gcd(a,b);
                a /= g; b /= g;
                Map<Long,Map<Long,Integer>> mapi = nega;
                if((A[i]>0&&B[i]>0)||(A[i]<0&&B[i]<0)) mapi = posi;
                if(!mapi.containsKey(a)){
                    mapi.put(a,new TreeMap<>());
                }
                Map<Long,Integer> map = mapi.get(a);
                Integer val = map.get(b);
                if(val==null) val = 1;
                else val++;
                map.put(b,val);
            }
        }
        long ans = 1;
        ans = ans*(power(2,zeroA)+power(2,zeroB)-1)%mod;
        for(Map.Entry<Long,Map<Long,Integer>> e:posi.entrySet()){
            long a = e.getKey();
            Map<Long,Integer> map = e.getValue();
            for(Map.Entry<Long,Integer> ff:map.entrySet()){
                Long b = ff.getKey();
                int p = ff.getValue();
                int q = 0;
                if(nega.containsKey(b)) {
                    Map<Long,Integer> curmap = nega.get(b);
                    q = curmap.getOrDefault(a,0);
                    curmap.remove(a);
                    if(curmap.size()==0) nega.remove(b);
                }
                ans = ans*(power(2,p)+power(2,q)-1)%mod;
            }
        }
        for(Map.Entry<Long,Map<Long,Integer>> e:nega.entrySet()){
            Map<Long,Integer> map = e.getValue();
            for(Map.Entry<Long,Integer> ff:map.entrySet()){
                int q = ff.getValue();
                ans = ans*power(2,q)%mod;
            }
        }
        ans = (ans+both-1+mod)%mod;
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
}