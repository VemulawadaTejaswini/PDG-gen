import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
        int [] arr=  new int[3];
        arr[0] = ms.nextInt();
        arr[1] = ms.nextInt();
        arr[2] = ms.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
           br = new BufferedReader(new InputStreamReader(System.in));
        }
   
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   
        int nextInt() {
            return Integer.parseInt(next());
        }
   
        long nextLong() {
            return Long.parseLong(next());
        }
   
        double nextDouble() {
            return Double.parseDouble(next());
        }
   
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
  
     }
}