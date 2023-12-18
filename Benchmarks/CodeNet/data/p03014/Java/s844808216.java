
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());//int型
        int W = Integer.parseInt(sc.next());
        String[][] s = new String[H][W];

        for (int i=0; i<H; i++){
            String sline = sc.next();
            for (int j=0; j<W; j++){
                s[i][j] = String.valueOf(sline.charAt(j));
            }
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(s[i][j].equals(".")) {
                    ans = Math.max(checkLight(i,j,H,W,s),ans);
                }
            }
        }
        System.out.println(ans);
    }

    public static int checkLight(int y, int x, int H, int W, String[][] s) {
        int nowy = y;
        int nowx = x;
        int count = 1;

        while(s[nowy][nowx].equals(".") ) {
            count++;
            nowy--;
            if(nowy>=H || nowy<0) break;
        }
        nowy = y;
        nowx = x;
        while(s[nowy][nowx].equals(".") ) {
            count++;
            nowy++;
            if(nowy>=H || nowy<0) break;
        }
        nowy = y;
        nowx = x;

        while(s[nowy][nowx].equals(".")) {
            count++;
            nowx--;
            if(nowx>=W || nowx<0) break;
        }
        nowy = y;
        nowx = x;

        while(s[nowy][nowx].equals(".")) {
            count++;
            nowx++;
            if(nowx>=W || nowx<0) break;
        }

        return count;
    }
}
