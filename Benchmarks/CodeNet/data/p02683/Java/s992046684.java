import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[][] c = new int[n][m+1];

        int ans = Integer.MAX_VALUE;

        for (int i=0; i<n; i++) {
            for (int j=0; j<m+1; j++) {
                c[i][j] = sc.nextInt();
            }
        }


        outer:
        for (int i=0; i<(int)Math.pow(2, n); i++) {
            int cost = 0;
            int[] arr = new int[m];
            String tmp = Integer.toBinaryString(i);
            if (tmp.length() < n) {
                while (tmp.length() < n) {
                    tmp = "0" + tmp;
                }
            }

//            System.out.println(tmp);

            for (int j=0; j<tmp.length(); j++) {
                if (tmp.charAt(j) == '1') {
                    cost += c[j][0];
                    for (int k=0; k<m; k++) {
                        arr[k] += c[j][k+1];
                    }
                }
            }

            for (int j=0; j<m; j++) {
                if (arr[j] < x) continue outer;
            }

            ans = Math.min(ans, cost);

        }

        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }

        System.out.println(ans);


    }

    void dfs() {

    }

//    int calc() {
//
//    }
}
