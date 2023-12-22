import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int sum = Integer.parseInt(sc.next());

        if (sum > 4 * num) {
            System.out.println("No");
        }
        if (sum < 2 * num) {
            System.out.println("No");
        }

        for (int i = 0; i <= num; i++) {
            if (sum == (2 * i) + (4 * (num - i))) {
                System.out.println("Yes");
            }
        }
        System.out.println("No");

        sc.close();
    }
}
