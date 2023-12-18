import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        List<Pair> pairs = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            pairs.add(new Pair(x[i], y[i]));
        }
        // 入力
        Collections.sort(pairs);
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int difx = pairs.get(i).x - pairs.get(j).x;
                int dify = pairs.get(i).y - pairs.get(j).y;
                int tmp = 0;
                for (int k = 0; k < n; k++) {
                    for (int h = k + 1; h < n; h++) {
                        int sax = pairs.get(k).x - pairs.get(h).x;
                        int say = pairs.get(k).y - pairs.get(h).y;
                        if (difx == sax && dify == say) {
                            tmp++;
                        }
                    }

                }
                if (tmp > ans) {
                    ans = tmp;
                }
            }

        }
        ans = n - ans;
        if (n == 1) {
            ans = 1;
        }
        System.out.println(ans);
        sc.close();
    }
}

class Pair implements Comparable<Pair> {
    // x , y 昇順ソート
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair other) {
        if (this.x == other.x) {
            return this.y - other.y;
        }
        return this.x - other.x;
    }
}
