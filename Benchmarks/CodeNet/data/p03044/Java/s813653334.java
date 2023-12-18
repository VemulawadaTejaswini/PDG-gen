import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] painted;
    static Queue[] a;
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        a = new Queue[N];
        for(int i = 0 ; i < N ; i++) {
            a[i] = new LinkedList<String>();
        }
        painted = new int[N];//0 undef 1 white 2 black
        Queue<String> q = new LinkedList<String>();
        for(int i = 0 ; i < N - 1 ; i++) {
            String[] strs = stdR.readLine().split(" ");
            int u = Integer.parseInt(strs[0]) - 1;
            int v = Integer.parseInt(strs[1]) - 1;
            int w = Integer.parseInt(strs[2]);
            if(u > v) {
                int tmp = u;
                u = v;
                v = tmp;
            }
            a[u].add(v+" "+w);
            a[v].add(u+" "+w);
        }
        String[] s = a[0].poll().toString().split(" ");
        int v = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        if(w % 2 == 0) {
            painted[0] = 1;
            painted[v] = 1;
        }else {
            painted[0] = 1;
            painted[v] = 2;
        }
        //System.out.println(v);
        painter(v);
        
        for(int i = 0 ; i < N ; i++) {
            System.out.println(painted[i] - 1);
        }
    }
    
    public static void painter(int u) {
        while(!a[u].isEmpty()) {
            String[] s = a[u].poll().toString().split(" ");
            int v = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            //System.out.println(u+","+v+","+w+","+a[u].size());
            if(w % 2 == 0) {
                if(painted[u] == 1) {
                    painted[v] = 1;
                }else {
                    painted[v] = 2;
                }
            }else {
                if(painted[u] == 1) {
                    painted[v] = 2;
                }else {
                    painted[v] = 1;
                }
            }
            painter(v);
        }
    }
}
