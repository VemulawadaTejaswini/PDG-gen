import java.util.*;

public class Main {
    static int n, m;
    static int[][] canGo;
    static int[] guide;
    static int[][] stack = new int[10000000][2];
    static int stackID = 0;
    static int IDstart = 0;

    static void search(int prev, int i) {
        if(guide[i] == 0) {
            guide[i] = prev;
            for(int j = 1; j <= n; j++) {
                if(canGo[i][j] == 1) {
                    stack[stackID][0] = i;
                    stack[stackID++][1] = j;
                }
            }
        }
        if(IDstart < stackID) {
            IDstart++;
            search(stack[IDstart-1][0], stack[IDstart-1][1]);
        }
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        canGo = new int[n + 1][n + 1];
        guide = new int[n + 1];
        for (int[] can : canGo)
            Arrays.fill(can, 0);
        Arrays.fill(guide, 0);
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            canGo[a][b] = 1;
            canGo[b][a] = 1;
        } 

        for(int j = 1; j <= n; j++) {
            if(canGo[1][j] == 1) search(1, j);
        }

        for(int j = 1; j <= n; j++) {
            if(guide[j] == 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for(int j = 2; j <= n; j++) {
            System.out.println(guide[j]);
        }
    } 
}