import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static List<Integer>[] g;
    static int n;
    static int[] dep;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //PrintWriter out = new PrintWriter(System.out);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt();
        dep = new int[n+1];
        g = new LinkedList[n+1];
        for(int i=0;i<=n;i++) g[i]=new LinkedList<>();
        for(int i=1;i<n;i++){
            int a =sc.nextInt(), b=sc.nextInt();
            g[a].add(b); g[b].add(a);
        }
        dfs(1,1,0);
        int maxi=0,idx=1;
        for(int i=2;i<=n;i++){
            if(dep[i]>maxi) idx=i;
            maxi=Math.max(maxi,dep[i]);
        }
        Arrays.fill(dep,0);
        dfs(idx,idx,0);
        int dia=0;
        for(int i=1;i<=n;i++) dia=Math.max(dia,dep[i]);
        String ans = dia%3==1?"Second":"First";
        System.out.println(ans);
    }
    static void dfs(int root, int from, int level){
        dep[root]=level;
        for(int to:g[root]){
            if(to==from) continue;
            dfs(to,root,level+1);
        }
    }
}