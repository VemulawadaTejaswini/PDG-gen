import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> Judge_Status1 = new HashMap<String, Integer>();
        HashMap<Integer, String> Judge_Status2 = new HashMap<Integer, String>();

        Judge_Status1.put("AC", 0);
        Judge_Status1.put("WA", 1);
        Judge_Status1.put("TLE", 2);
        Judge_Status1.put("RE", 3);

        Judge_Status2.put(0, "AC");
        Judge_Status2.put(1, "WA");
        Judge_Status2.put(2, "TLE");
        Judge_Status2.put(3, "RE");

        int Map[] = new int[4];

        int N = nextInt();
 
        for (int i=0; i<N; i++) {
            Map[Judge_Status1.get(next())] ++;
        }

       
        for (int i=0; i<4; i++) {
            System.out.println(Judge_Status2.get(i) + " x " + Map[i]);
        }
        
    }
    
      
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}
