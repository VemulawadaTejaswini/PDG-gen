import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
    static int n;
    static int[][] t;
    static HashMap<String, Integer> map;
    static final int MAX = 300;
    static final int INF = -(1<<29);
    static void init(){
        map = new HashMap<String, Integer>();
        t = new int[MAX][MAX];
        for(int[] j : t) Arrays.fill(j, INF);
    }
    static int idxAt(String s){
        if(!map.containsKey(s)){
            map.put(s, map.size());
        }
        return map.get(s);
    }

    static void solve(){
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(t[i][k] == INF || t[k][j] == INF) continue;
                    if(t[i][j] == INF) t[i][j] = t[i][k] + t[k][j];
                    else if(t[i][j] != t[i][k] + t[k][j]){
                        out.println("No");
                        return;
                    }
                }
            }
        }
        out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true){
            n = sc.nextInt();
            if(n == 0) break;

            init();
            for(int i=0;i<n;i++){
                String a = sc.next();
                String b = sc.next();
                sc.next();
                String c = sc.next();
                String d = sc.next();

                c = c.substring(c.indexOf("^")+1);

                int ii = idxAt(b);
                int jj = idxAt(d);


                int cc = new Integer(c);
                t[ii][jj] = cc;
                t[jj][ii] = -cc;
            }
            n = map.size();
            solve();
        }
    }

}