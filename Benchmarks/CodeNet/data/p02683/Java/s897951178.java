import java.util.Scanner;

public class Main {
    static int n = 0;
    static int m = 0;
    static int x = 0;
    static int[] c = null;
    static int[][] a = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        x = in.nextInt();
        c = new int[n];
        a = new int[n][m];
        for(int i=0; i<n; i++) {
            c[i] = in.nextInt();
            for(int j=0; j<m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<m; i++) {
            int sumSkill = 0;
            for(int j=0; j<n; j++) {
                sumSkill += a[j][i];
            }
            if(sumSkill<x) {
                System.out.println(-1);
                return;
            }
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<(1<<n); i++) {
            int cost = totalCost(i);
            if(cost>0) {
                ans = Math.min(ans, cost);
            }
        }
        System.out.println(ans);
    }
    private static int totalCost(int books) {
        int total = 0;
        int[] sumSkills = new int[m];
        for(int i=0; i<n; i++) {
            if((books & (1<<i)) == 0) {
                continue;
            }
            for(int j=0; j<m; j++) {
                sumSkills[j] += a[i][j];
            }
            total += c[i];
        }
        for(int j=0; j<m; j++) {
            if(sumSkills[j] < x) {
                return -1;
            }
        }
        return total;
    }
}
