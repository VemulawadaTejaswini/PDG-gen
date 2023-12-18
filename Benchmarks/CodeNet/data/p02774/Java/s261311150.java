
import java.io.*;
import java.util.*;
public class Main {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMMMM      MMMMMM      OOO      OOO        SSSS   SSS     EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEE           MMMM MMM  MMM MMMM    OOO          OOO    SSSS       SSS   EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM  MMMMMM  MMMM   OOO            OOO   SSSS             EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM  OOO              OOO   SSSSSSS         EEEEE          /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO      SSSSSS       EEEEEEEEEEE    /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO         SSSSSSS   EEEEEEEEEEE    /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM   OOO            OOO              SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM    OOO          OOO     SSS       SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM      OOO      OOO        SSS    SSSS    EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        boolean is = true;
        int n = sc.nextInt();
        long k = sc.nextLong();
        Integer[] pos = new Integer[n];
        Integer[] neg= new Integer[n];
        for (int i =0;i<n;i++){
            pos[i]= sc.nextInt();
            neg[i]=-pos[i];
        }
        Arrays.sort(pos);
        Arrays.sort(neg);
        long ans =0;
        long low =(long)-1e18;
        long hi = (long)1e18;
        while (low<=hi){
            long mid = low+hi >>1;
            long count =0;
            for (int i =0;i<n;i++){
                if (pos[i]<0){
                    int ll=0;
                    int hh =n -1;
                    int idx=-1;
                    while (ll<=hh){
                        int mm= ll+hh >>1;
                        if (-1l*neg[mm]*pos[i]<=mid){
                            idx=mm;
                            ll=mm+1;
                        }
                        else hh=mm-1;
                    }
                    if (idx!=-1)
                        count+=idx+1;
                    if (idx!=-1&&neg[idx]>=-1*pos[i])
                        count--;
                }
                else {
                    int ll=0;
                    int hh =n -1;
                    int idx=-1;
                    while (ll<=hh){
                        int mm= ll+hh >>1;
                        if (1l*pos[mm]*pos[i]<=mid){
                            idx=mm;
                            ll=mm+1;
                        }
                        else hh=mm-1;
                    }
                    if (idx!=-1)
                        count+=idx+1;
                    if (idx!=-1&&pos[idx]>=pos[i])
                        count--;
                }
            }
            if (count/2>=k){
                ans=mid;
                hi=mid-1;
            }
            else low=mid+1;
        }
        pw.println(ans);
        pw.flush();
    }
    static long sumrange(int a, int b){
            return -1l*a*(a-1)/2 + 1l*b*(b+1)/2;
    }

    static class FenwickTree { // one-based DS

        int n;
        long[] ft;

        FenwickTree(int size) { n = size; ft = new long[n+1]; }

        long rsq(int b) //O(log n)
        {
            long sum = 0;
            while(b > 0) { sum += ft[b]; b -= b & -b;}		//min?
            return sum;
        }

        long rsq(int a, int b) { return rsq(b) - rsq(a-1); }

        void point_update(int k, int val)	//O(log n), update = increment
        {
            while(k <= n) { ft[k] += val; k += k & -k; }		//min?
        }
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

}