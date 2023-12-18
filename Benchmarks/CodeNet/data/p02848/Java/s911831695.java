import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main { //christmas gifts
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException {
        int N = readInt();
        String s = next();
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch+N>90)
                ch = (char)(65 + (N+ch-91));
            else
                ch = (char)(ch + N);
            System.out.print(ch);
        }
    }
    static class Pair {
        int p , s;
        public Pair(int p, int s){
            this.p = p;
            this.s = s;
        }
    }
    static String next() throws IOException{
        while(st==null||!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException{
        return Integer.parseInt(next());
    }
}
