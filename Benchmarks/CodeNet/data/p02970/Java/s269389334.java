import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int canwatch = (d * 2) + 1;
        if (n % canwatch == 0) {
            System.out.println(n / canwatch);
        } else {
            System.out.println(n / canwatch + 1);
        }
    }
}
