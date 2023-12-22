import java.util.*;

class Main {

    static void solve (int n, int k, int[] needs, int[][] wants) {

        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += wants[j][i];
            }
            if (sum > needs[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n == 0 && k == 0)   break;

            int [] needs = new int[k];

            for(int i = 0; i < k; i++)  needs[i] = sc.nextInt();
            
            int [][] wants = new int[n][k];

            for(int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) wants[i][j] = sc.nextInt();
            }

            solve(n, k, needs, wants);
        }

    }
}