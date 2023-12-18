import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int[][] array = new int[100002][C];
        for (int i=0;i<N;i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next())-1;
            array[s][c]++;
            array[t+1][c]--;
        }
        int ans = 0;
        for (int i=1;i<=100000;i++) {
            int tmp = 0;
            for (int j=0;j<C;j++) {
                array[i][j]+=array[i-1][j];
                tmp += array[i][j];
            }
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}