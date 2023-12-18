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
        int len = S.length();

        char[] myList = S.toCharArray();
        int[] mod = new int[len];

        int temp = myList[len-1]-'0';
        mod[len-1] = temp;
        int tenPower = 1;
        for(int i = len-2; i>=0; i--){
            tenPower *= 10;
            tenPower %=2019;
            temp = myList[i]-'0';
            mod[i] = (temp*tenPower + mod[i+1]) % 2019;
        }

        int[] fq = new int[2019];
         
        for(int i = 0; i<len; i++){
            fq[mod[i]] ++;
        }

        // A - B = 0 --> A % 2019 = B % 2019
        // 1817181712114
        // A = 1817181712114 % 2019 = 1165
        // B =      81712114 % 2019 = 1165
        // A - B = 18171 * 10000000
        // 10000000 can never % 2019, so 18171 must % 2019
        
        long count = fq[0]; // handle special case
        for(int i = 0; i<2019; i++){
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