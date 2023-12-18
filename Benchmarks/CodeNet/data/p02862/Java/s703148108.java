import java.io.*;
import java.util.StringTokenizer;

class main {
    public static PrintWriter out = new PrintWriter(System.out);
    public static FastScanner enter = new FastScanner(System.in);
    public static void main(String[] args) throws IOException {
        solve();
        out.close();
    }

    static long mod=(long)1e9+7;
    static long arr[] = new long[(int)1e6+2];
    private static void solve() throws IOException{
        int x=enter.nextInt(),y=enter.nextInt();
        if(2*x-y<0 || (2*x-y)%3!=0 ||2*y-x<0 || (2*y-x)%3!=0){
            out.println(0);
            return;
        }
        int a=(2*x-y)/3;
        int n=(y+x)/3;
        long n_fact=1;
        arr[1]=1;
        arr[0]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]*i;
            arr[i]%=mod;
        }
        long ans=bin_pow(arr[a],mod-2, mod)*bin_pow(arr[n-a],mod-2, mod);
        ans%=mod;
        ans*=arr[n];
        ans%=mod;
        out.println((ans%mod+mod)%mod);
    }

    public static long bin_pow(long a,long b, long mod){//a^b %mod
        long ans=1;
        while(b!=0){
            if((b&1)==1) ans*=a;
            a*=a;
            ans%=mod;
            a%=mod;
            b>>=1;
        }
        return ans%mod;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer stok;

        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        String next() throws IOException {
            while (stok == null || !stok.hasMoreTokens()) {
                String s = br.readLine();
                if (s == null) {
                    return null;
                }
                stok = new StringTokenizer(s);
            }
            return stok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        char nextChar() throws IOException {
            return (char) (br.read());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }


}
