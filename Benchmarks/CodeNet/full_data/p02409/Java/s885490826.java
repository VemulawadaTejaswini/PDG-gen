import java.util.*;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        int[][][] rooms = new int[4][3][10];
        
        int n = scanner.nextInt();
        
        for(int i = 0; i < n; ++i) {
            int b, f, r, v;
            
            b = scanner.nextInt();
            f = scanner.nextInt();
            r = scanner.nextInt();
            v = scanner.nextInt();
            
            --b; --f; --r;
            
            rooms[b][f][r] += v;
        }
        
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 3; ++j) {
                for(int k = 0; k < 10; ++k) {
                    System.out.print((k == 0 ? "" : " ") + rooms[i][j][k]);
                }
                System.out.println();
            }
            
            if(i != 3)
                System.out.println("####################");
        }
    }
}
