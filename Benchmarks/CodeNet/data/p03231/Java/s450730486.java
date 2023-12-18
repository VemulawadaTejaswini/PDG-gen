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
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String s = br.readLine();
        String t = br.readLine();
        
        long x = lcm(n, m);
        long ans = x;
        //outer: for (int i = x; (i <= (n-1)*i/n + 1) || (i <= (m-1)*i/m + 1); i += x) {
        outer: for (long i = x; i <= x; i += x) {
            //System.out.println(i);
            for (int j = 0; j < n; j += 1) {
                for (int k = 0; k < n; k += 1) {
                    //if (j*i/n+1 == k*i/m+1) {
                    if (j*i/n == k*i/m) {
                        //System.out.println("aaa");
                        if (s.charAt(j) != t.charAt(k)) {
                            ans = -1;
                            break outer;
                        }
                    }
                    
                }
            }
        }
        System.out.println(ans);
    }
}
