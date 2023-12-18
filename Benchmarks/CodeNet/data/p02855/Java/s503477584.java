import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        FastReader read = new FastReader();
        int H = read.nextInt();
        int W = read.nextInt(); 
        int k = read.nextInt();
        String array[] = new String[H];
        boolean check = false;
        int t = 0;
        int count = 1;
        for(int i = 0; i<H; i++){
            array[i] = read.nextLine();
        }
        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
                if(array[i].charAt(j)== '#' ){
                    if(t >= 1){
                        count++;
                    }
                    t++;
                }
                System.out.print(count + " ");
            }
            count++;
            t=0;
            System.out.println();
        }
        
    }
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
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
}
