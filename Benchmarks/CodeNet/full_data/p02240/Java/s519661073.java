import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
    private static int[] g;
    private static ArrayList<Integer>[] f;
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        final int n = Integer.parseInt(in.substring(0, in.indexOf(' ')));
        final int m = Integer.parseInt(in.substring(in.indexOf(' ')+1));
        g = new int[n];
        f = new ArrayList[n];
        for(int i = 0; i<n; i++)
            f[i] = new ArrayList<Integer>();
        for(int i = 0; i<m; i++){
            in = br.readLine();
            final int s = Integer.parseInt(in.substring(0, in.indexOf(' ')));
            final int t = Integer.parseInt(in.substring(in.indexOf(' ')+1));
            f[s].add(t);
            f[t].add(s);
        }
        int id = 0;
        for(int i = 0; i<n; i++){
            if(g[i]==0) group(i, ++id);
        }
        final StringBuilder sb = new StringBuilder();
        final int q = Integer.parseInt(br.readLine());
        for(int i = 0; i<q; i++){
            in = br.readLine();
            final int s = Integer.parseInt(in.substring(0, in.indexOf(' ')));
            final int t = Integer.parseInt(in.substring(in.indexOf(' ')+1));
            sb.append(g[s]==g[t] ? "yes\n" : "no\n");
        }
        System.out.print(sb);
    }
    private static void group(int u, int id){
        if(g[u]!=0) return;
        g[u] = id;
        for(int i = 0, n = f[u].size(); i<n; i++){
            group(f[u].get(i), id);
        }
    }
}