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
        String s = next();
        if(s.equals("SUN")){
            System.out.println(7);
        }
        else if(s.equals("SAT")){
            System.out.println(1);
        }
        else if(s.equals("FRI"))
            System.out.println(2);
        else if(s.equals("THU"))
            System.out.println(3);
        else if(s.equals("WED"))
            System.out.println(4);
        else if(s.equals("TUE"))
            System.out.println(5);
        else if(s.equals("MON"))
            System.out.println(6);
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
