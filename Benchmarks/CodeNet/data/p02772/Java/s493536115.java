import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0 && (x % 3 != 0 && x % 5 != 0)) {
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }
}