import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        List<Pair> pairs = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            pairs.add(new Pair(i + 1, a[i]));
        }
        Collections.sort(pairs);
        int ans[][] = new int[h][w];
        int i = 0;
        int j = 0;
        int dir = 1; // 1は右に進む // 2は左に進む
        while (true) {
            if (pairs.size() == 0) {
                break;
            }
            Pair p = pairs.get(0);
            pairs.remove(0);
            for (int k = 0; k < p.count; k++) {
                ans[i][j] = p.color;
                if (dir == 1) {
                    j++;
                    if (j == w) {
                        i++;
                        j = w - 1;
                        dir = 2;
                    }
                } else if (dir == 2) {
                    j--;
                    if (j == -1) {
                        i++;
                        j = 0;
                        dir = 1;
                    }
                }

            }

        }
        for (int k = 0; k < h; k++) {
            for (int l = 0; l < w; l++) {
                System.out.print(ans[k][l]);
                if (l != w)
                    System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}

class Pair implements Comparable {
    int color;
    int count;

    Pair(int color, int count) {
        this.color = color;
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        Pair compPair = (Pair) o;
        if (this.count < compPair.color) {
            return -1;
        } else if (this.count > compPair.color) {
            return 1;
        } else {
            return 0;
        }
    }
}
