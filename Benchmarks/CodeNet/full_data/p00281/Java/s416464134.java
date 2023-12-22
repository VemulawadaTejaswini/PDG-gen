import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Work> works = new ArrayList<>();
        while (true) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int w = sc.nextInt();
            if (s == 0 && t == 0 && w == 0) {
                break;
            }
            works.add(new Work(s, t, w));
        }
        int l = sc.nextInt();
        int[][] fees = new int[l][m + 1];
        for (int i = 0; i < l; i++) {
            for (int j = 1; j <= m; j++) {
                fees[i][j] = sc.nextInt();
            }
        }
        int[][] matrix = new int[l][n + 1];
        for (Work w : works) {
            for (int i = 0; i < l; i++) {
                matrix[i][w.person] += fees[i][w.type] * w.count;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            for (int j = 1; j <= n; j++) {
                if (j != 1) {
                    sb.append(" ");
                }
                sb.append(matrix[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    
    static class Work {
        int person;
        int type;
        int count;
        
        public Work(int person, int type, int count) {
            this.person = person;
            this.type = type;
            this.count = count;
        }
    }
}
