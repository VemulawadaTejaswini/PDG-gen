import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] g = new int[n][][];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            g[i] = new int[a][2];
            for (int j = 0; j < a; j++) {
                g[i][j][0] = sc.nextInt() -1;
                g[i][j][1] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ArrayDeque<Integer> q = new ArrayDeque<>();
            ArrayDeque<Integer> t = new ArrayDeque<>();
            ArrayDeque<Integer> f = new ArrayDeque<>();
            t.add(i);
            q.add(i);
            boolean con = true;
            while(!q.isEmpty()){
                for(int[] b : g[q.poll()]){
                    if(b[1] == 0){
                        if(t.contains(b[0])){
                            con = false;
                            break;
                        }
                        if(!f.contains(b[0])) f.add(b[0]);
                    }else{
                        if(f.contains(b[0])){
                            con = false;
                            break;
                        }
                        if(!t.contains(b[0])){
                            t.add(b[0]);
                            q.add(b[0]);
                        }
                    }
                }
                if(!con) break;
            }
            for (int j = 0; j < n; j++) {
                boolean add = false;
                if(!t.contains(j) && !f.contains(j)){
                    for (int[] c : g[j]) {
                        if(c[1] == 0){
                            if(t.contains(c[0])){
                                add = false;
                                break;
                            }
                        }else{
                            if(f.contains(c[0])){
                                add = false;
                                break;
                            }
                        }
                    }
                }
                if(add && !t.contains(j)){
                    t.add(j);
                }
            }
            if(con && ans < t.size()) ans = t.size();
        }
        System.out.println(ans);
        sc.close();

    }

}
