import java.util.*;

public class Main {
    static int w;
    static int h;
    static int[][] costs;
    static ArrayList<Integer> wList;
    static ArrayList<Integer> hList;
    static int count;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if (w == 0 && h == 0) {
                break;
            }
            char[][] field = new char[h][];
            costs = new int[w * h][w * h];
            int startW = 0;
            int startH = 0;
            wList = new ArrayList<>();
            hList = new ArrayList<>();
            for (int i = 0; i < h; i++) {
                field[i] = sc.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    if (field[i][j] == 'o') {
                        startH = i;
                        startW = j;
                    } else if (field[i][j] == '*') {
                        wList.add(j);
                        hList.add(i);
                    }
                }
            }
            wList.add(startW);
            hList.add(startH);
            for (int i = 0; i < h * w; i++) {
                Arrays.fill(costs[i], Integer.MAX_VALUE / 10);
                costs[i][i] = 0;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < h; k++) {
                        for (int l = 0; l < w; l++) {
                            if (field[i][j] != 'x' && field[k][l] != 'x' && ((i == k && Math.abs(j - l) == 1) || (j == l && Math.abs(i - k) == 1))) {
                                costs[i * w + j][k * w + l] = 1;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < h * w; i++) {
                for (int j = 0; j < h * w; j++) {
                    for (int k = 0; k < h * w; k++) {
                        costs[j][k] = Math.min(costs[j][k], costs[j][i] + costs[i][k]);
                    }
                }
            }
            count = wList.size();
            dp = new int[count][1 << (count - 1)];
            int ans = dfw(count - 1, (1 << (count - 1)) - 1);
            if (ans >= Integer.MAX_VALUE / 10) {
                sb.append(-1).append("\n");
            } else {
                sb.append(ans).append("\n");
            }
        }
        System.out.print(sb);
    }
        
    static int dfw(int from, int key) {
        if (key == 0) {
            return 0;
        }
        if (dp[from][key] != 0) {
            return dp[from][key];
        }
        int min = Integer.MAX_VALUE / 10;
        for (int i = 0; i < count - 1; i++) {
            if (((1 << i) & key) == 0) {
                continue;
            }
            int value = costs[hList.get(i) * w + wList.get(i)][hList.get(from) * w + wList.get(from)];
            min = Math.min(min, dfw(i, key ^ (1 << i)) + value);
        }
        dp[from][key] = min;
        return min;
    }
}
