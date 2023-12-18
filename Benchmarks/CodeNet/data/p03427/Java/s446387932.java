import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        String n = sc.next();

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        int tmp = n.charAt(0) - '1';
        tmp += 9 * (n.length() - 1);

        System.out.println(Math.max(sum, tmp));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
