
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class ABC149D {
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
    public static void main(String[] args) throws IOException {
        FastReader br=new FastReader();
        String[] t=br.nextLine().split("\\ ");
        int N=Integer.parseInt(t[0]);
        int K=Integer.parseInt(t[1]);
        t=br.nextLine().split("\\ ");
        int R=Integer.parseInt(t[0]);
        int S=Integer.parseInt(t[1]);
        int P=Integer.parseInt(t[2]);
        
        //0=R, 1=S, 2=P
        String moves=br.nextLine();
        String[] cc=new String[K]; Arrays.fill(cc,"");
        for(int i=0;i<N;i++){
            cc[i%K]+=moves.charAt(i);
        }
        
        int greedy=0;
        for(int i=0;i<K;i++){
            if(cc[i].charAt(0)=='r')greedy+=P;
            else if(cc[i].charAt(0)=='s')greedy+=R;
            else if(cc[i].charAt(0)=='p')greedy+=S;
            boolean used=true;
            for(int j=0;j<cc[i].length()-1;j++){
                if(cc[i].charAt(j+1)!=cc[i].charAt(j)){
                    
                        if(cc[i].charAt(j+1)=='r')greedy+=P;
                        else if(cc[i].charAt(j+1)=='s')greedy+=R;
                        else if(cc[i].charAt(j+1)=='p')greedy+=S;
                        used=true;
                }else if(used){
                    used=false;
                }else{
                    if(cc[i].charAt(j+1)=='r')greedy+=P;
                    else if(cc[i].charAt(j+1)=='s')greedy+=R;
                    else if(cc[i].charAt(j+1)=='p')greedy+=S;
                    used=true;
                }
            }   
            
        }
        System.out.println(greedy);
    }
    
}
