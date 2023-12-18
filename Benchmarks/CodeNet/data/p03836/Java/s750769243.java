import java.util.*;

public class Main {
    static private Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        
        displayChars(sx, tx, 'R');
        displayChars(sy, ty, 'U');
        displayChars(tx, tx + 1, 'R');
        displayChars(ty, sy - 1, 'D');
        displayChars(tx + 1, sx, 'L');
        displayChars(sy - 1, ty, 'U');
        displayChars(sx, tx, 'R');
        displayChars(ty, ty + 1, 'U');
        displayChars(tx, sx - 1, 'L');
        displayChars(ty + 1, sy, 'D');
        displayChars(sx - 1, sx, 'R');
    }
    
    static void displayChars(int a, int b, char c) {
        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        for(int i = a; i < b; ++i) {
            System.out.print(c);
        }
    }
}
