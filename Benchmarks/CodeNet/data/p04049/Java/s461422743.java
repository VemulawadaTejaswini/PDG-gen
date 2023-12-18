import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] num = line.split(" ");
        int n = Integer.parseInt(num[0]);
        int k = Integer.parseInt(num[1]);
        List<Integer>[] g = new ArrayList[n];
        int a;
        int b;
        for(int i = 0; i < n; i++){
            g[i] = new ArrayList();
        }
        for(int i = 0; i < n-1; i++){
            line = br.readLine();
            num = line.split(" ");
            a = Integer.parseInt(num[0]);
            b = Integer.parseInt(num[1]);
            g[a-1].add(b-1);
            g[b-1].add(a-1);
        }
        List<Integer> result = new ArrayList();
        int now = 0;
        int d = n - 1;
        int branch = n;
        List<Integer> point = new ArrayList();
        while(true){
            branch = n;
            int e = 0;
            for(int i = 0; i < n; i++){
                if(result.indexOf(i) != -1){
                    continue;
                }
                if(g[i].size() == 1){
                    e = g[i].get(0);
                    now = diameter(i, e, g);
                    if(d >= now) {
                        d = now;
                        if(branch > g[e].size()){
                            branch = g[e].size();
                            point = new ArrayList();
                            point.add(i);
                            if(branch == 2){
                                break;
                            }
                        } else if(g[e].indexOf(point.get(0)) != -1){
                            point.add(i);
                        }
                    }
                }
            }
            if(d <= k) {
                break;
            }
            for(int j : point){
                e = g[j].get(0);
                delete(j,e,g);
                result.add(j);
            }
        }
        System.out.println(result.size());
    }

    public static int diameter(int s, int e, List<Integer>[] g) {
        int max = 0;
        int now = 0;
        for(int x : g[e]){
            if(x != s){
                now = diameter(e, x, g);
                if(now > max) {
                    max = now;
                }
            }
        }
        return max + 1;
    }

    public static void delete(int s, int e, List<Integer>[] g) {
        g[s].clear();
        g[e].remove(g[e].indexOf(s));
    }
}
