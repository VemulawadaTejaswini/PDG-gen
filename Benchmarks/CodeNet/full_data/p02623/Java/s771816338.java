import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.*;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static int lowerBound
            (Integer[] array, int length, int value) {
        int l = 0;
        int r = length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (value < array[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static long gcd(long a, long b){
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
    public static void main(String [] args)  {
        // int T = sc.nextInt();while (T--!=0)
        {
            solve();
        }
    }
    public static void solve()  {
//////////////////////////////////////////////////////////////////////
        long n =sc.nextLong();
        long m =sc.nextLong();
        long k =sc.nextLong();
        Deque<Long> a = new LinkedList<>();
        Deque<Long>  b = new LinkedList<>();
        for (long i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        for (long i = 0; i < m; i++) {
            b.add(sc.nextLong());
        }
        long cn=0;
        long sum=0;
        while(sum<k){
            if(b.isEmpty()&&a.isEmpty()) {
                break;
            }
            else if((!a.isEmpty() && !b.isEmpty()) &&  (a.getFirst().equals(b.getFirst()))){
                long x =a.getFirst();
                long y =b.getFirst();
                a.removeFirst();
                b.removeFirst();
                if(a.getFirst()<b.getFirst()){
                    sum+=x;
                    b.add(y);
                }
                else {
                    sum+=y;
                    a.add(x);
                }
                cn++;
                continue;

            }
            if( b.isEmpty() || (!a.isEmpty() &&  a.getFirst()<=b.getFirst())){
                sum+=a.getFirst();
                a.removeFirst();
            }
            else  {
                sum += b.getFirst();
                b.removeFirst();
            }
            cn++;
        }


        if(sum<=k){
            System.out.println(cn);
        }
        else System.out.println(cn-1);
///////////////////////////////////////////////////////////////////////
    }

}
