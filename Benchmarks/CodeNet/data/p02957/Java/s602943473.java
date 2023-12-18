import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        long sum = a + b;
        if (sum % 2 == 0) {
            System.out.println(sum / 2);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

}
