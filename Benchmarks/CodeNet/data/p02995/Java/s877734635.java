import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 *
 * @author dkcs
 */
class Main
{
    static class FastReader {
        
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
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
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static class Node {
        
        long pp;
        long a, b;
        
        Node(long x, long y) {
            a = x;
            b = y;
            pp = a * b;
        }
    }
    
    static class Comp implements Comparator<Node> {
        
        public int compare(Node o1, Node o2) {
            if (o1.pp > o2.pp) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) 
    {
        FastReader sc = new FastReader();
        String s[]=sc.nextLine().split(" ");
        BigInteger a=new BigInteger(s[0]);
        BigInteger b=new BigInteger(s[1]);
        BigInteger c=new BigInteger(s[2]);
        BigInteger d=new BigInteger(s[3]);
        BigInteger g=c.gcd(d);
        BigInteger lcm=(c.multiply(d)).divide(g);
        
        BigInteger ca=(a.subtract(BigInteger.ONE)).divide(c);
        BigInteger cb=b.divide(c);
        
        BigInteger da=(a.subtract(BigInteger.ONE)).divide(d);
        BigInteger db=b.divide(d);
        
        BigInteger la=(a.subtract(BigInteger.ONE)).divide(lcm);
        BigInteger lb=b.divide(lcm);
        
        BigInteger ans1=(cb.subtract(ca));
        BigInteger ans2=(db.subtract(da));
        BigInteger ans3=(lb.subtract(la));
        
        BigInteger ans=ans1.add(ans2);
        ans=ans.subtract(ans3);
        
        BigInteger t=b.subtract(a.subtract(BigInteger.ONE));
        ans=t.subtract(ans);
        System.out.println(ans);


        
        
        
        
        
    }
    
    
}
