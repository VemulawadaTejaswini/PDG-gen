import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (i % Math.sqrt(i) == 0) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
