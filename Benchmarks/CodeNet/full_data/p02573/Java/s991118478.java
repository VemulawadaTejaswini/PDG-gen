import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 友達グループ
        int groups[] = new int[n];
        // 各友達グループの人数
        int counts[] = new int[n];
        for (int i = 0; i < n; ++i) {
            // 人i は グループiに属する
            groups[i] = i;
            counts[i] = 0;
        }

        for (int i = 0; i < m; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            int group_a = groups[a];
            int group_b = groups[b];

            if (group_a != group_b) {
                for (int j = 0; j < n; ++j) {
                    if (groups[j] == group_b) {
                        groups[j] = group_a;
                    }
                }
            }
        }
        
        // 各グループの人数を数えて最大値を求める
        int max = 0;
        for (int i = 0; i < n; ++i) {
            int g = groups[i];
            counts[g] += 1;
        }
        for (int i = 0; i < n; ++i) {
            max = Math.max(max, counts[i]);
        }

        System.out.println(max);
    }
}