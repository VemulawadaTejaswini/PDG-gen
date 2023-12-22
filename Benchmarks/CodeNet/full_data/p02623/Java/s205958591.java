import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

    static FastReader s = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    private static int[] rai(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    private static int[][] rai(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    private static long[] ral(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        return arr;
    }

    private static long[][] ral(int n, int m) {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextLong();
            }
        }
        return arr;
    }

    private static int ri() {
        return s.nextInt();
    }

    private static long rl() {
        return s.nextLong();
    }

    private static String rs() {
        return s.next();
    }

    static int bsearch(long[] arr,long find)
    {
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]<=find)
            {
                if(mid==arr.length-1 ||  arr[mid+1]>find)
                {
                    return mid;
                }
                else
                {
                    l=mid+1;
                }
            }
            else {
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        StringBuilder ans = new StringBuilder();
//        int t=ri();
        int t=1;
        while (t-- > 0)
        {
            int n=ri();int m=ri();
            long k=rl();
            long[] a=ral(n);
            long[] b=ral(m);

            long[] dp1=new long[n];
            long[] dp2=new long[m];
            long sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=a[i];
                dp1[i]=sum;
//                System.out.print(dp1[i]+" ");
            }
//            System.out.println();
            sum=0;
            for(int i=0;i<m;i++)
            {
                sum+=b[i];
                dp2[i]=sum;
//                System.out.print(dp2[i]+" ");
            }
//            System.out.println();

            int count=0;
            for(int i=0;i<n;i++)
            {
                if(dp1[i]>k)
                {
                    break;
                }
                long left=k-dp1[i];
                int ind=bsearch(dp2,left);
                if(ind==-1)
                {
                    break;
                }
                else
                {
                    count=Math.max(count,i+1+ind+1);
                }

            }
            ans.append(count).append("\n");
        }
        out.print(ans.toString());
        out.flush();

    }
}
