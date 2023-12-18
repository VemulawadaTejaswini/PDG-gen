import java.util.*;

public class Main {
    static ArrayList<ArrayList<Path>> graph = new ArrayList<>();
    static int[] dist;
    static int[] depth;
    static int[][] parents;
    static HashMap<Integer, HashMap<Integer, Integer>> counts = new HashMap<>();
    static HashMap<Integer, HashMap<Integer, Integer>> sums = new HashMap<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    graph.get(a).add(new Path(b, c, d));
		    graph.get(b).add(new Path(a, c, d));
		}
		dist = new int[n];
		depth = new int[n];
		parents = new int[18][n];
		setParent(0, 0, 0, 0);
		for (int i = 1; i < 18; i++) {
		    for (int j = 0; j < n; j++) {
		        parents[i][j] = parents[i - 1][parents[i - 1][j]];
		    }
		}
		Question[] questions = new Question[q];
		for (int i = 0; i < q; i++) {
		    questions[i] = new Question(sc.nextInt(), sc.nextInt(), sc.nextInt() - 1, sc.nextInt() - 1);
		}
		int[] cArr = new int[n];
		int[] sArr = new int[n];
		tour(0, 0, cArr, sArr);
		StringBuilder sb = new StringBuilder();
		for (Question x : questions) {
		    sb.append(x.getAns()).append("\n");
		}
		System.out.print(sb);
   }
   
   static void tour(int idx, int parent, int[] cArr, int[] sArr) {
       if (counts.containsKey(idx)) {
           for (int x : counts.get(idx).keySet()) {
               counts.get(idx).put(x, cArr[x]);
               sums.get(idx).put(x, sArr[x]);
           }
       }
       for (Path p : graph.get(idx)) {
           if (p.idx == parent) {
               continue;
           }
           cArr[p.color]++;
           sArr[p.color] += p.dis;
           tour(p.idx, idx, cArr, sArr);
           cArr[p.color]--;
           sArr[p.color] -= p.dis;
       }
   }
   
   static class Question {
       int left;
       int right;
       int color;
       int value;
       int lca;
       int dis;
       
       public Question(int color, int value, int left, int right) {
           this.left = left;
           this.right = right;
           this.color = color;
           this.value = value;
           lca = getLCA(left, right);
           dis = dist[left] + dist[right] - dist[lca] * 2;
           setMap(left, color);
           setMap(right, color);
           setMap(lca, color);
       }
       
       private void setMap(int idx, int color) {
           if (!counts.containsKey(idx)) {
               counts.put(idx, new HashMap<>());
               sums.put(idx, new HashMap<>());
           }
           counts.get(idx).put(color, 0);
           sums.get(idx).put(color, 0);
       }
       
       public int getAns() {
           int c = counts.get(left).get(color) + counts.get(right).get(color) - counts.get(lca).get(color) * 2;
           int s = sums.get(left).get(color) + sums.get(right).get(color) - sums.get(lca).get(color) * 2;
           return dis - s + c * value;
       }
       
       private int getLCA(int a, int b) {
           if (depth[a] > depth[b]) {
               return getLCA(b, a);
           }
           int sa = depth[b] - depth[a];
           for (int i = 17; i >= 0; i--) {
               if (sa >= (1 << i)) {
                   b = parents[i][b];
                   sa -= (1 << i);
               }
           }
           for (int i = 17; i >= 0; i--) {
               if (parents[i][a] != parents[i][b]) {
                   a = parents[i][a];
                   b = parents[i][b];
               }
           }
           if (a != b) {
               a = parents[0][a];
               b = parents[0][b];
           }
           return a;
       }
   }
   
   static void setParent(int idx, int parent, int dis, int dep) {
       dist[idx] = dis;
       depth[idx] = dep;
       parents[0][idx] = parent;
       for (Path p : graph.get(idx)) {
           if (p.idx == parent) {
               continue;
           }
           setParent(p.idx, idx, dis + p.dis, dep + 1);
       }
   }
   
   static class Path {
       int idx;
       int color;
       int dis;
       
       public Path(int idx, int color, int dis) {
           this.idx = idx;
           this.color = color;
           this.dis = dis;
       }
   }
}
