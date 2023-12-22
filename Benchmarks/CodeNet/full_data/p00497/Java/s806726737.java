import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
 
public class Main {
 
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n+1][n+1];
        for(int i=0;i<m;i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            map[a][b] = x+1;
        }
        int cnt = 0;
        for(int i=1;i<=n;i++) for(int j=1;j<=i;j++) {
            map[i][j] = max(map[i][j], max(map[i-1][j-1]-1, map[i-1][j]-1));
        }
        for(int i=1;i<=n;i++) for(int j=1;j<=i;j++)
            if(map[i][j]>0) cnt++;
        System.out.println(cnt);
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
}