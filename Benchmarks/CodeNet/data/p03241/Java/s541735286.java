import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        for (int n = N ; n <= M ; n++) {
            if (M % n == 0) {
                System.out.println(M / n);
                return;
            }
        }
    }
}
