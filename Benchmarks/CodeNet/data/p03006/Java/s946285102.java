import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[n][2];
        Set<Pair> b = new HashSet<>();
        for (int i = 0; i < n; i++) {
            g[i][0] = sc.nextInt();
            g[i][1] = sc.nextInt();
            b.add(new Pair(g[i][0], g[i][1]));
        }
        Arrays.sort(g, (x, y) -> x[1] - y[1]);
        Arrays.sort(g, (x, y) -> x[0] - y[0]);
        Set<Pair> checked = new HashSet<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                int p = g[i][0] - g[j][0];
                int q = g[i][1] - g[j][1];
                Pair a = new Pair(p, q);
                if(checked.contains(a)){
                    continue;
                }
                checked.add(a);
                int t = 0;
                for (int k = 0; k < n; k++) {
                    int tx = g[k][0] + p;
                    int ty = g[k][1] + q;
                    Pair c = new Pair(tx, ty);
                    if(b.contains(c)) t++;
                }
                if(max < t) max = t;
            }
        }
        System.out.println(n-max);
        sc.close();

    }

}

class Pair{
    int x;
    int y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Pair p = (Pair) obj;
        if(p.x == this.x && p.y == this.y) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash += x * 17;
        hash += y * 19;
        return hash;
    }
}
