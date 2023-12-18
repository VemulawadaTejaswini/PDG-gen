import sun.util.resources.cldr.ar.CalendarData_ar_YE;

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
    static int lower(Integer[]b,int val,int limit){
        int lo=0;
        int hi=b.length-1;
        int ans=-1;
        while (lo<=hi){
         int mid=lo+hi >>1;
         if (b[mid]+val>=limit){
             ans=mid;
             hi=mid-1;
         }
         else lo=mid+1;
        }
        return ans;
    }
    static int upper(Integer[]b,int val,int limit){
        int lo=0;
        int hi=b.length-1;
        int ans=-1;
        while (lo<=hi){
            int mid=lo+hi >>1;
            if (b[mid]+val<limit){
                ans=mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]a= new int[n];
        Integer[]b = new Integer[n];
        for (int i =0;i<n;i++)a[i]=sc.nextInt();
        for (int i =0;i<n;i++)b[i]=sc.nextInt();
        long ret=0;
        for (int k =0;k<=28;k++){
            int[]acopy=a.clone();
            Integer[]bcopy=b.clone();
            int mod= 1<<(k+1);
            for (int i =0;i<n;i++){
                acopy[i]%=mod;
                bcopy[i]%=mod;
            }
            Arrays.sort(bcopy);
            int ans=0;
            for (int i =0;i<n;i++){
                int x1=lower(bcopy,acopy[i],1<<k);
                if (x1!=-1&&acopy[i]+bcopy[x1]< (1<<k)*2){
                    ans+=(upper(bcopy,acopy[i],(1<<k)*2)-x1+1);
                }
                x1=lower(bcopy,acopy[i],(1<<k)*3);
                if (x1!=-1&&acopy[i]+bcopy[x1]<(1<<k)*4)
                    ans+=(upper(bcopy,a[i],(1<<k)*4)-x1+1);
                ans%=2;
            }
            if (ans==1)ret+=1<<k;
        }
        pw.println(ret);
        pw.flush();
    }


//    static class pair implements Comparable<pair>{
//        int u,v;
//        pair(int a,int b){
//            u=a;
//            v=b;
//        }
//
//        @Override
//        public int compareTo(pair pair) {
//            return u==pair.u?v-pair.v:u-pair.u;
//        }
//    }
//    static class Edge implements Comparable<Edge>{
//        int node,cost;
//        Edge(int a,int b){
//            node=a;
//            cost=b;
//        }
//
//        @Override
//        public int compareTo(Edge edge) {
//            return edge.cost-cost;
//        }
//    }
//    static long gcd(long a, long b) {
//        if (a == 0) return b;
//        return gcd(b % a, a);
//    }
//
//    static int inver(long x, int mod) {
//        int a = (int) x;
//        int e = (mod - 2);
//        int res = 1;
//        while (e > 0) {
//            if ((e & 1) == 1) {
//                //System.out.println(res*a);
//                res = (int) ((1l * res * a) % mod);
//            }
//            a = (int) ((1l * a * a) % mod);
//            e >>= 1;
//        }
//        //out.println(res+" "+x);
//        return res % mod;
//    }
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