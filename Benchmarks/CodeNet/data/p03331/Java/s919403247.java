import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum == 1 ? 10 : sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
