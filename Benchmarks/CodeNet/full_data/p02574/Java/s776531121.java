import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new FastScanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        var set = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            set.add(a[i]);
        }
        
        boolean b = true;
        if(set.size() < n){
            b = false;
        }else{
            List<Integer> list = sieve(1000);
            var list2 = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                boolean prime = true;
                for(int x : list){
                    if(a[i] % x == 0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                    list2.add(a[i]);
                }
            }
            list.addAll(list2);
            
            for(int x : list){
                int count = 0;
                for(int i = 0; i < n; i++){
                    if(a[i] % x == 0){
                        count++;
                    }
                }
                if(count >= 2){
                    b = false;
                    break;
                }
            }
        }
        
        if(b){
            System.out.println("pairwise coprime");
        }else{
            long gcd = gcd(a[0], a[1]);
            for(int i = 2; i < n; i++){
                gcd = gcd(gcd, a[i]);
            }
            if(gcd == 1){
                System.out.println("setwise coprime");
            }else{
                System.out.println("not coprime");
            }
        }
    }
    
    static List<Integer> sieve(int x){
        
        var p = new boolean[x+1];
        Arrays.fill(p, true);
        int sqrt = (int)Math.sqrt(x+1);
        for(int i = 2; i <= sqrt; i++){
            if(!p[i]) continue;
            for(int j = i*i; j <= x; j += i){
                p[j] = false;
            }
        }
        var list = new ArrayList<Integer>();
        if(x >= 2) list.add(2);
        for(int i = 3; i <= x; i += 2){
            if(p[i]) list.add(i);
        }
        return list;
    }
    
    static long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a%b);
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
        String next(){
            while(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }
}