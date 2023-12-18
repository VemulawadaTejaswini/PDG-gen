import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 1;
        for (int i = x; i <= y; i++) {
            sum *= i;
        }
        if (sum > 0) {
            System.out.println("Positive");
        } else if (sum < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
