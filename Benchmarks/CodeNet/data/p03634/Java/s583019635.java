import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
import static java.lang.System.out;
import static java.lang.Integer.parseInt;
 
public class Main {
    static class Element {
        long t, c;
        Element(long t,long c){
            this.t=t;this.c=c;
        }
    }
 
    static int NN = 100007;
    static ArrayList<Element>[] G = new ArrayList[NN];
    static long z[] = new long[NN];
 
    static void dfs(int x, int p) {
        for (Element e : G[x]) {
            if ((e.t - p) != 0) {
                z[(int) e.t] = z[x] + e.c;
                dfs((int) e.t, x);
            }
        }
    }
 
    public static void main(String[] args) throws IOException {
        for(int i=0;i<NN;i++) G[i]=new ArrayList<Element>();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            G[a].add(new Element(b,c));
            G[b].add(new Element(a,c));
        }
        int q=sc.nextInt();
        n=sc.nextInt();
        dfs(n,0);
        for(int j=0;j<q;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
 
            out.println(z[a]+z[b]);
        }
    }
}