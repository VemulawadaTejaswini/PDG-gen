import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[][] c = new int[10][10];
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                c[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        int[] cost = new int[10];
        for(int k=0; k<10; k++) {
            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    if(i == k) continue;
                    c[i][j] = Math.min(c[i][j], c[i][k]+c[k][j]);
                }
            }
        }
        
        int[][] a = new int[h][w];
        long ans = 0;
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                a[i][j] = Integer.parseInt(sc.next());
                if(a[i][j] == -1 || a[i][j] == 1) continue;
                ans += c[a[i][j]][1];
            }
        }
        System.out.println(ans);
     }
}
