import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        int[] cntFact = new int[1001];
        boolean[] hash = new boolean[1001];
        int n = in.nextInt();
        Arrays.fill(hash,false);
        Arrays.fill(cntFact,0);

        for(int i=2;i<=n;i++){
            if(!hash[i]){
                for(int j=i;j<=n;j+=i){
                    int k = j;
                    while(k%i == 0){
                        cntFact[i]++;
                        k/=i;
                    }
                    hash[j] = true;
                }
            }
        }

        long ans = 1;
        long mod = (long)1e9+7;
        for(int i=0;i<=n;i++){
            ans=(ans*(cntFact[i]+1))%mod;
        }
        out.print(ans);

    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
