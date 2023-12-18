import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class Main {
	static class IO 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public IO() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
        int [] readarray(int sz){
            int [] ret = new int[sz];
            for(int i = 0; i<sz; i++)ret[i] = nextInt();
            return ret;
        }
    } 
    public static void main(String[] args){
        IO fs = new IO();
        long n = fs.nextLong(),k = fs.nextLong();
        Set<Long> st = new HashSet<Long>();
        for(long i = 0; i<k; i++){
            st.add(fs.nextLong());
        }
        long ans = 0;
        for(long i = n; i<=10000000; i++){
            long tocheck = i;
            boolean ok = true;
            while(tocheck!=0){
                if(st.contains(tocheck%10)){
                    ok = false;
                    break;
                }
                tocheck/=10;
            }
            if(ok){
                ans = tocheck;
                break;
            }
        }
        System.out.println(ans);
    }
    public static long power(long x,long y){
        long res = 1;
        while(y>0){
            if(y%2 == 1)res = (res*x);
            y>>=1;
            x = x*x;
        }
        return res;
    }
}
