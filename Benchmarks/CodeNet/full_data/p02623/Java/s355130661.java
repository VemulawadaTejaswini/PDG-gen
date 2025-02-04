import java.io.*;
import java.util.*;
public class Main {
    static long startTime;
    static long endTime;
    static Boolean [] prime ;
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
    public  static  long countDivs(long n ){
        int cn=0;
        long sqr = (long)Math.sqrt(n);
        for (long i = 1; i<=sqr ; ++i) {
            if(n%i==0){
                ++cn;
            }
        }
        cn*=2;
        if(sqr*sqr==n) cn--;
        return cn;

    }
    static void prime(int  x) {
        //sieve algorithm. nlog(log(n)).
        prime=new Boolean[ (x+1)];
        Arrays.fill(prime,true);
        prime[0] = prime[1] = false;
        for (int  i = 2; i * i <= x ; i++)
            if (prime[i])
                for (int  j = i * i; j <= x; j += i)
                    prime[j] = false;
    }
    static int[] sum;
    static void cumulitiveSum( int [] arr){
        sum = new int[arr.length];
        sum[0]=arr[0];
        for (int i = 1; i <arr.length; i++) {
            sum[i]=arr[i]+sum[i-1];
        }
    }
    public static void main(String [] args)  {
        startTime = System.currentTimeMillis();
        int T = sc.nextInt();while (T--!=0)
        {
            solve();
        }
        endTime = System.currentTimeMillis();
        long duration= endTime-startTime;
        //System.out.println(duration);
    }
    public static void solve()  {
//////////////////////////////////////////////////////////////////////
        int n =sc.nextInt();
        int m =sc.nextInt();
        int k =sc.nextInt();
        Deque<Integer> a = new LinkedList<>();
        Deque<Integer>  b = new LinkedList<>();

        // Integer [] a = new Integer [n];
        //Integer [] b = new Integer[m];
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        long cn=0;
        long sum=0;
        int j=0;
        while(sum<k){
            if(b.isEmpty()&&a.isEmpty()) {
                break;
            }
            if( b.isEmpty() || (!a.isEmpty() &&  a.getFirst()<=b.getFirst())){
                sum+=a.getFirst();
                a.removeFirst();
            }
            else {
                sum += b.getFirst();
                b.removeFirst();
            }

            cn++;


        }
        if(sum==k){
            System.out.println(cn);
        }
        else System.out.println(cn-1);
///////////////////////////////////////////////////////////////////////
    }

}
