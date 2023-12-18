import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        //ArrayList myList = new ArrayList<>();

        String S = next();
        int l = S.length();

        char[] myList = S.toCharArray();
        int[] mod = new int[l];

        int temp = myList[l-1]-'0';
        mod[l-1] = temp;
        int tenPower = 1;
        for(int i = l-2; i>=0; i--){
            tenPower *= 10;
            tenPower %=2019;
            temp = myList[i]-'0';
            mod[i] = (temp*tenPower + mod[i+1]) % 2019;
        }

        int[] fq = new int[2019];
         
        for(int i = 0; i<l; i++){
            fq[mod[i]] ++;
        }

        long count = fq[0];
        for(int i = 1; i<2019; i++){
            if(fq[i]>1){
                count += fq[i] * (fq[i]-1) /2;
            }
            
        }
        System.out.println(count);
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