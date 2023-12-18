import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        
        int x = tx - sx;
        int y = ty - sy;
        
        
        for (int i = 0; i < y; i++) {
            System.out.print("U");
        }
        for (int i = 0; i < x; i++) {
            System.out.print("R");
        }
        for (int i = 0; i < y; i++) {
            System.out.print("D");
        }
        for (int i = 0; i < x; i++) {
            System.out.print("L");
        }
        System.out.print("LU");
        for (int i = 0; i < y; i++) {
            System.out.print("U");
        }
        System.out.print("R");
        for (int i = 0; i < x; i++) {
            System.out.print("R");
        }
        System.out.print("DR");
        for (int i = 0; i < y; i++) {
            System.out.print("D");
        }
        System.out.print("DL");
        for (int i = 0; i < x; i++) {
            System.out.print("L");
        }
        System.out.println("U");
        
        // U*y+R*x+D*y+L*x +LU+ U*y +R+ R*x +DR+ D*y +L+ L*x + U
    }
}
