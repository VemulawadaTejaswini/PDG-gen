import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // to: 隣接リスト
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        
        int[][] data = new int[m][2];
        boolean[][] canPass = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
            to[t].add(s);
            canPass[s][t] = true;
            canPass[t][s] = true;
            data[i][0] = s;
            data[i][1] = t;
        }
        
        int count = 0;
        int start = 0;
        for (int i = 0; i < m; i++) {
            // 封鎖する
            int tmps = data[i][0];
            int tmpt = data[i][1];
            canPass[tmps][tmpt] = false;
            canPass[tmpt][tmps] = false;
            
            Queue<Integer> que = new ArrayDeque<Integer>();
            que.add(start);
            
            boolean[] visited = new boolean[n];
            visited[start] = true;
            
            boolean ok = true;
            int cnt = 1;
            while (!que.isEmpty()) {
                int p = que.poll();
                
                for (Integer q : to[p]) {
                    // System.out.println(i + " " + (p+1) + " " + (q+1));
                    if (!visited[q]) {
                        if (canPass[p][q]) {
                            que.add(q);
                            visited[q] = true;
                            cnt++;
                            // System.out.println(q+1);
                        }
                    }
                }
            }
            
            if (cnt != n) {
                count++;
                // System.out.println(i);
            }
            
            canPass[tmps][tmpt] = true;
            canPass[tmpt][tmps] = true;
        }
        System.out.println(count);
    }
}