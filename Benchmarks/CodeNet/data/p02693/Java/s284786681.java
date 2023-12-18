 import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String ans = "NG";
        for (int i = a; i < b + 1; i++) {
            if (i % k == 0) {
                ans = "OK";
                break;
            }
        }

        System.out.println(ans);
    }
}
