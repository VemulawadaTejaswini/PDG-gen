import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        // 高橋くんのモンスター
        int a = sn.nextInt();
        int b = sn.nextInt();
        
        // 青木くんのモンスター
        int c = sn.nextInt();
        int d = sn.nextInt();
        
        while(a > 0 && c > 0) {
            // 高橋くんのターン
            c -= b;
            if(c == 0) {
                System.out.print("Yes");
                return;
            }
            // 青木くんのターン
            a -= d;
            if(a == 0) {
                System.out.print("No");
                return;
            }
        }
    }
}
