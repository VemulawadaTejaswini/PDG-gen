import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    int[] s;
    long mod = 1000000000+7;
    String str;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        // binary search
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        str = sc.next();
        char[] ss = str.toCharArray();
        s = new int[n];
        for(int i=0;i<n;i++) s[i] = ss[i]-'a';
        long ans = 0;
        // first check the lower limit
        int lo = 1;
        if(!valid(lo)) return 0;
        int hi = s.length/2+1;
        while(hi>lo+1){
            int mid = (hi+lo)/2;
            if(valid(mid)) lo = mid;
            else hi = mid;
        }
        return lo;
    }
    boolean valid(int len){
        // check whether len is valid
        if(2*len>s.length) return false;
        HashMap<Long, HashSet<Integer>> rec = new HashMap<>(s.length);
        long curHash = 0;
        for(int i=0;i<len;i++){
            curHash = (26*curHash+s[i])%mod;
        }
        HashSet<Integer> temp = new HashSet<>();
        temp.add(0);
        rec.put(curHash,temp);
        long pow26len = power(26,len-1); // factor for decrease at rolling
        for(int i=1;i+len-1<s.length;i++){
            curHash = (curHash+mod-s[i-1]*pow26len%mod)%mod;
            curHash = (curHash*26+s[i+len-1])%mod;
            if(rec.get(curHash)==null){
                HashSet<Integer> curSet = new HashSet<>();
                curSet.add(i); // starting at i
                rec.put(curHash,curSet);
            } else{
                HashSet<Integer> curSet = rec.get(curHash);
                for(int start : curSet){
                    if(i < start+len) continue;
                    if(str.substring(start,start+len).equals(str.substring(i,i+len))){
                        return true; // there exist such two substrings
                    }
                }
                rec.get(curHash).add(i);
            }
        }
        return false;
    }
    long power(long base, long po){
        long ans = 1;
        while(po>0){
            if(po%2>0){
                ans = (ans*base)%mod;
            }
            base = base*base%mod;
            po /= 2;
        }
        return ans;
    }
}

