
import java.util.Scanner;

public class Main {

    private static int H=0;
    private static int W=0;
    private static int minSteps=Integer.MAX_VALUE;
    private static char[][] mtx;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        mtx = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            mtx[i] = s.toCharArray();
        }
        rec(0,0,0);
        System.out.println(minSteps);
    }
    private static void rec(int r,int c, int steps){
        if(mtx[r][c]=='#'){
            steps++;
        }
        if(r== (H-1) && c== (W-1) ) {
            minSteps = Math.min(minSteps,steps);
            return;
        }

        //right
        if(c+1<W)
        rec(r,c+1,steps);
        //down
        if(r+1<H)
        rec(r+1,c,steps);

    }

}