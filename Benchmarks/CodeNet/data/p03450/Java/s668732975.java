import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static final int MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(System.in);
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] s;
        s = sc.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        HashMap<Integer, Integer>[] d = new HashMap[n+1];
        for (int i = 0; i <= n; i++) {
            d[i] = new HashMap<Integer, Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            s = sc.readLine().split(" ");
            int xLi = Integer.parseInt(s[0]);
            int xRi = Integer.parseInt(s[1]);
            int xDi = Integer.parseInt(s[2]);
            d[xLi].put(xRi, xDi);
            d[xRi].put(xLi, -xDi);
        }

        Queue<Integer> q = new LinkedList<Integer>();
        int[] pos = new int[n+1];
        Arrays.fill(pos, MAX);
        
        for (int i = 1; i <= n; i++) {
            if (pos[i] != MAX) continue;
            
            q.add(i);
            pos[i] = 0;
            while (!q.isEmpty()) {
                int f = q.poll();
                for (Integer k : d[f].keySet()) {
                    Integer vFK = d[f].get(k);
                    
                    if (pos[k] != MAX) {
                        if (pos[k] != pos[f] + vFK) {
                            System.out.println("No");
                            return;
                        }
                    } else {
                        q.add(k);
                        pos[k] = pos[f] + vFK;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
