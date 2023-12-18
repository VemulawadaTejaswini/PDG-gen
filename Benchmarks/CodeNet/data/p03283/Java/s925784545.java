import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = getInt(s[0]);
        int M = getInt(s[1]);
        int Q = getInt(s[2]);

        int[][] count = new int[N][N];
        // 発着の全組み合わせカウントアップ
        int[] start = new int[M];
        int[] goal = new int[M];
        for(int i = 0;i < M;i++){
            String[] train = sc.nextLine().split(" ");
            start[i] = getInt(train[0]);
            goal[i] = getInt(train[1]);
            for(int j = 0;j < N;j++){
                if(j+1 > start[i]) continue;
                for(int k = goal[i] - 1;k < N;k++){
                    count[j][k]++;
                }
            }
        }

        // 質問の答え取得
        for(int i = 0;i < Q;i++){
            String[] question = sc.nextLine().split(" ");
            start[i] = getInt(question[0]);
            goal[i] = getInt(question[1]);
            System.out.println(count[start[i] - 1][goal[i]-1]);
        }
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
    static long getLong(String val) {
        return Long.parseLong(val);
    }
}
