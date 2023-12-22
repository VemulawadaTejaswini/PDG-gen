
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int N = 100000;
    public static int[] color = new int[N];
    public static int NIL = -1;
    public static Vector<Integer>[] G = new Vector[N];

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) G[i] = new Vector<Integer>();
        m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            G[s].add(t);
        }

        //??????
        assign();

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            if(color[s] == color[t]) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }

    public static void assign() {
        int id = 1;
        for(int i = 0; i < n; i++) color[i] = NIL;
        for(int r = 0; r < n; r++) {
            if(color[r] == NIL) dfs(r, id++);
        }
    }

    public static void dfs(int r, int c) {
        color[r] = c;
        Stack<Integer> S = new Stack<Integer>();
        S.push(r);
        while(!S.empty()) {
            int s = S.pop();
            for(int t = 0; t < G[s].size(); t++) {
                if(color[t] == NIL) {
                    color[t] = c;
                    S.push(t);
                }
            }
        }
    }


}