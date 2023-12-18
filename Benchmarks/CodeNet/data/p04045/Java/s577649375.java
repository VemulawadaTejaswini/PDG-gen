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
    } 
    public static void main(String[] args){
        IO fs = new IO();
        int n = fs.nextInt(),k = fs.nextInt();
        Set<Integer> st = new HashSet<Integer>();
        for(int i = 0; i<k; i++){
            int x = fs.nextInt();
            st.add(x);
        }
        int rem = 0;
        int count = 0;
        int ans = 0;
        while(n!=0){
            int num = n%10;
            if(st.contains((num+rem)%10)){
                num+=1;
            }
            int z = (num+rem)%10;
            rem = (num+rem)/10;
            ans += (z*power(10,count));
            count+=1;
            n/=10;
        }
        if(rem!=0)ans += (rem*power(10,count+1));
        System.out.println(ans);
    }
    public static int power(int x,int y){
        int res = 1;
        while(y>0){
            if(y % 2 !=0)res = (res * x);
            y >>=1;
            x = (x*x);
        }
        return res;
    }
}
