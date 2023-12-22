import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.valueOf(scan.next());
        // int x = 3;
        int a = x;
        for (int i=1; i<3; i++) {
            a *= x;
        }
        System.out.println(String.valueOf(a));
    }
}
