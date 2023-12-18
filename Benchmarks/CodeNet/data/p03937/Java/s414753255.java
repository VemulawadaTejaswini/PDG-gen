import java.util.Scanner;

public class Main {
    static int[] vx = {1, 0};
    static int[] vy = {0, 1};
    static int h, w;
    static int[][] root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt(); w = sc.nextInt();
        root = new int[h+2][w+2];

        int cnt = 0;
        for(int i=1; i<=h; i++){
            String s = sc.next();
            for (int j = 1; j <= w; j++) {
                root[i][j] = ((s.charAt(j-1)=='.')?0:1);
                cnt += root[i][j];
            }
        }

        System.out.println((dfs(1, 1, cnt))?"Possible":"Impossible");
    }

    static boolean dfs(int x, int y, int cnt){
        if(x==w&&y==h){
            return ((cnt==1)?true:false);
        }else if(cnt==1){
            return false;
        }else{
            boolean bool = false;
            for (int i = 0; i < 2; i++) {
                if(root[y+vy[i]][x+vx[i]]==1){
                   if(dfs(x+vx[i], y+vy[i], cnt-1)) bool = true;
                }
            }
            return bool;
        }
    }
}
