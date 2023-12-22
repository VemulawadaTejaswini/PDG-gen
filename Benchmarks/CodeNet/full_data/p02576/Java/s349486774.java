import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int t = scanner.nextInt();

        int need = n / x;
        if (n % x != 0) {
            need++;
        }

        System.out.println(need * t);
    }
}