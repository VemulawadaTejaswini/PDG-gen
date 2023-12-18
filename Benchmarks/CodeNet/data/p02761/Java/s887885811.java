import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {
       static int mod  = 1000000007;
        static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
        int N = ms.nextInt();
        int M  = ms.nextInt();
        boolean repeat = true;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<M;i++){
            int s = ms.nextInt();
            int c = ms.nextInt();
            if(map.containsKey(s)){
                if(map.get(s)!=c)
                repeat = false;
            }
            else
            map.put(s,c);
        }
        if(!repeat){
            pw.println(-1);
        }else{
            int [] strings = new int[N];
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int u = entry.getKey();
                int v = entry.getValue();
                strings[u-1] = v;
                // ...
            }
            String str = "";
            for(int i=0;i<N;i++)
            str+=String.valueOf(strings[i]);
            pw.println(Long.parseLong(str)>0?str:"-1");
        }
        pw.flush();
       
      

    pw.flush();

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