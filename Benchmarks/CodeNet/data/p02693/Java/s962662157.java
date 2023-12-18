import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean bl = false;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                bl = true;
            }
        }
        System.out.println(bl?"OK":"NG");
    }
}

