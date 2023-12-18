import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        for (int i = 0; i < 10; i++) {
            int result = (r * x) - d;
            System.out.println(result);
            x = result;
        }
    }
}
