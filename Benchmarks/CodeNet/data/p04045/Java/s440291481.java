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
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(n!=0){
            a.add(n%10);
            n/=10;
        }
        int ans = 0;
        int i;
        for(i = 0; i<(int)a.size(); i++){
            int x = a.get(i);
            if(st.contains((x+rem)%10)){
                rem+=1;
            }
            int z = (x+rem)%10;
            rem = (x+rem)/10;
            ans += z*(int)Math.pow(10,i);
        }
        if(rem!=0)ans += rem*Math.pow(10, i);
        System.out.println(ans);
    }
}
