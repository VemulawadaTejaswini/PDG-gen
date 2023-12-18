import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += sc.nextInt();
        }

        System.out.println((sum % 3 == 0) ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
