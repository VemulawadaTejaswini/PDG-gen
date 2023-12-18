import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    static long lcm (long a, long b) {
    	long temp;
    	long c = a;
    	c *= b;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return (long)(c/b);
    }

    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        long n = Long.parseLong(nm[0]);
        long m = Long.parseLong(nm[1]);
        //String s = br.readLine();
        //String t = br.readLine();
        String[] s = br.readLine().split("");
        String[] t = br.readLine().split("");
        
        long x = lcm(n, m);
        long ans = x;
        long v = x/m;
        
        for (int j = 0; (j < n) && (j*m/n < m); j += v) {
            if (!s[(int)j].equals(t[(int)j*(int)m/(int)n])) {
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}
