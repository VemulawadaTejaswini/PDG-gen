    import java.util.*;
    import java.io.*;
    public class Main {
        
        static class N{
            int a,b;
            public String toString(){
                return a+" "+b;
            }
        }
        static boolean isp(long g){
            if(g<=3) return true;
            for(int i=2;i<=(int)Math.sqrt(g);i++){
                if(g%i==0) return false;
            }
            return true;
        }
        static long ge(int arr[], long l, long r, int n){
            while(true){
                long m = (l+r)/2;
                long val = getans(arr, m, n);
                long left = getans(arr, m-1, n);
                long right = getans(arr, m+1, n);
                if(left>=val && right>=val) return val;
                if(right>val) r = m-1;
                else l=m+1;
            }
        }
        /*static int  getp(int l, int r, long a, long b){
            while(true){
            int m  =(l+r)/2;
            System.out.println(m);
            long val = m*(a-m)*(b-m);
            long left = ((m-1)*(a-m+1)*(b-m+1));
            long right = ((m+1)*(a-m-1)*(b-m-1));
            if(val>=left && val>= right) return m;
            if(val > right) {
                r=m-1;
                continue;
            }
            l =m+1;
            }
        }*/
        static long getans(int arr[] , long b, int n){
            long ans =0;
            for(int i=0;i<n;i++){
                ans+=Math.abs(arr[i]-(b+i+1));
            }
            return ans;
        }
        public static void main(String args[]) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int tc = 1;//Integer.valueOf(br.readLine());
            for(int i=0;i<tc;i++){
                int n  = Integer.valueOf(br.readLine());
                int arr[] = new int[n];
                String gf[] = br.readLine().split(" ");
                for(int ii=0;ii<n;ii++) arr[ii] = Integer.valueOf(gf[ii]);
                System.out.println(ge(arr,Integer.MIN_VALUE, Integer.MAX_VALUE, n));
                long mina =Integer.MAX_VALUE;
                /*for(int j=-1222;j<=124124;j++) {
                    mina = Math.min(mina,getans(arr,j,n));
                }
                System.out.println(mina+" mina");*/
                //bw.write(ans+"\n");
            }
            bw.flush();
        }
    }
     