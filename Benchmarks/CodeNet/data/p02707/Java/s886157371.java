import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try{
                str=br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) throws IOException {
       FastReader in = new FastReader();
      int n=in.nextInt();
      int b[]=new int [n+1];
      Arrays.fill(b,0);

      for(int i=1;i<n;i++){
          b[in.nextInt()]++;
      }
      for(int i=1;i<=n;i++){
          System.out.println(b[i]);
      }

    }
}
