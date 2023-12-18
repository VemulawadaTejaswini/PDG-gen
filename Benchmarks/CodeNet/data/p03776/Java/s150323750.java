import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        List<Long> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(in.nextLong());
        }

        Collections.sort(list,Collections.reverseOrder());
        List<Long> t = list.subList(0,a);
        int[] cnt = new int[t.size()];
        Arrays.fill(cnt,0);

        long sum =0;
        for(int x = 0;x<t.size();x++){
            for(long y:list){
                if(y==t.get(x)){
                    cnt[x]++;
                }
            }
            sum+=t.get(x);
        }
        double ans1 = sum/(double)t.size();
        out.printf("%.6f\n",ans1);
        long ans = 1;
        for(int i=0;i<t.size();){
            int j = i+1;
            while (j<t.size() && t.get(j) == t.get(i)){
                j++;
            }
            ans*=nCr(cnt[i],j-i);
            i=j;
        }
        out.println(ans);
    }

    private long nCr(int a, int b){
        int c = a-b;
        int mn = Math.min(c,b);
        int mx = Math.max(c,b);

        boolean[] mrk = new boolean[mn+1];
        Arrays.fill(mrk,false);
        mrk[0]=true;

        long v = 1;
        for(int i = a;i>mx;i--){
            int g = i;
            for(int j=0;j<=mn;j++){
                if(!mrk[j] && g%j==0){
                    g/=j;
                    mrk[j] = true;
                }
            }
            v*=g;
        }
        return v;
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
