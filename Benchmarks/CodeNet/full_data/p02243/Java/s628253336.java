import java.util.*;

public class Main {
    static int WHITE = 0;
    static int GRAY = 1;
    static int BLACK = 2;

    static class kvPair {
        int point;
        int value;

        kvPair(int point, int value) {
            this.point = point;
            this.value = value;
        }
    }

    // 构建比较器
    static Comparator<kvPair> cKvPair=new Comparator<kvPair>() {
        public int compare(kvPair o1, kvPair o2) {
            if(o1.value!=o2.value) // 先比较边权值，按升序排序
                return o1.value-o2.value;
            else // 再比较点编号，按升序排序
                return o1.point-o2.point;
        }

    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<ArrayList<kvPair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<kvPair>());
        }
        for (int i = 0; i < n; i++) {
            int u = input.nextInt();
            int k = input.nextInt();
            for (int j = 0; j < k; j++) {
                int v = input.nextInt();
                int c = input.nextInt();
                adj.get(u).add(new kvPair(v, c));
            }
        }

        Queue<kvPair> PQ = new PriorityQueue<>(cKvPair);
        int[] color = new int[n];
        int[] d = new int[n];

        for(int i = 0; i < n; i++) {
            d[i] = Integer.MAX_VALUE;
            color[i] = WHITE;
        }

        d[0] = 0;
        PQ.add(new kvPair(0,0));
        color[0] = GRAY;

        while(!PQ.isEmpty()){
            kvPair f = PQ.poll();
            int u = f.point;
            color[u] = BLACK;

            // 取出最小值，如果不是最短路径则忽略
            if(d[u] < f.value) continue;

            for(int i = 0; i < adj.get(u).size(); i++){
                int v = adj.get(u).get(i).point;
                if(color[v] == BLACK) continue;
                if(d[v] > d[u] + adj.get(u).get(i).value) {
                    d[v] = d[u] + adj.get(u).get(i).value;
                    PQ.add(new kvPair(v, d[v]));
                    color[v] = GRAY;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(i + " " + d[i]);
        }
    }
}

