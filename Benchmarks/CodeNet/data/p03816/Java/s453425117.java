import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        int[] cnt = new int[100002];
        Arrays.fill(cnt,0);

        int n = in.nextInt();
        for(int i=0;i<n;i++){
            cnt[in.nextInt()]++;
        }
        int idx = -1;
        for(int i=0;i<100001;i++){
            if(cnt[i] > 1){
                if(idx == -1){
                    idx = i;
                    continue;
                }
                int mn = Math.min(cnt[idx]-1,cnt[i]-1);
                cnt[idx]-=mn;
                cnt[i]-=mn;

                if(cnt[idx] == 1 && cnt[i] == 1) idx = -1;
                else if(cnt[idx] == 1) idx = i;
            }
        }

        int ans = 0;
        for (int i=0;i<=100000;i++){
            if(cnt[i] >= 1) {
                ans= ans+1-(cnt[i]-1);
            }
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
