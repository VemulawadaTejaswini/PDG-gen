// ABC152のB問題
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        if(a >= b) {
            for(int i = 0; i < a; ++i) {
                System.out.printf("%d", b);
            }
        }
        else {
            for(int i = 0; i < b; ++i) {
                System.out.printf("%d", a);
            }
        }

    }
}
