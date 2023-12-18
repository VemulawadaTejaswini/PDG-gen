import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        if (d % m == 0) {
            System.out.println(m + d);
        } else {
            System.out.println(d - m);
        }
    }
}
