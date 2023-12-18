import java.awt.Point;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        Point[] grid = new Point[H*W+1];
        
        for(int i = 1; i <= H; i++)
            for(int j = 1; j <= W; j++)
                grid[sc.nextInt()] =  new Point(i,j);
        
        int Q = sc.nextInt();
        int L, R;
        Point p1, p2;
        int puntos;
        while(Q-- > 0){
            puntos = 0;
            L = sc.nextInt();
            R = sc.nextInt();
            p1 = grid[L];
            while(L != R){
                L += D;
                p2 = grid[L];
                puntos += Math.abs(p2.x - p1.x) + Math.abs(p2.y - p1.y);
                p1 = p2;
            }
            System.out.println(puntos);
            
        }
    }
}