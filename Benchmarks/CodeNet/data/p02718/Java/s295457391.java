import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            } catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
  public static void main(String[] args)throws Exception{
    FastReader in = new FastReader();
    int n = in.nextInt(), m = in.nextInt();
    Integer[] a = new Integer[n];
    int s = 0;
    for(int i = 0; i < n; i++){
      a[i] = in.nextInt();
      s+= a[i];
    }
    Arrays.sort(a, Collections.reverseOrder());
    int min = s / (4 *m);
    boolean ok = true;
    for(int i = 0; i < m; i++){
      if(a[i] < min){
        ok = false;
        break;
      }
    }
    System.out.println((ok)?"Yes":"No");
  }
}