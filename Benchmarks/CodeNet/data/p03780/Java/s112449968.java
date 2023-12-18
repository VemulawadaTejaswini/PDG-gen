import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        int n = in.nextInt();
        long k = in.nextLong();

        List<Long> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(in.nextLong());
        }

        int ans = n;
        int tk = 0;
        Collections.sort(list,Collections.reverseOrder());

        for(int i=0;i<list.size();i++){
            if(list.get(i)>=k){
                ans--;
                tk = i+1;
                continue;
            }

            long v = list.get(i);
            int j;
            for(j=i+1;j<list.size();j++){
                v+= list.get(j);
                if(v>=k){
                    break;
                }
            }
            //out.print(tk+" "+j);
            if(list.size() == j) break;
            if(tk > j) continue;
            ans-= (j-tk+1);
            tk= j+1;
            //out.println(" "+ans);
            if(ans == 0) break;
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
