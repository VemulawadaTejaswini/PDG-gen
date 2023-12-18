import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b;
        a = scanner.nextLong();
        b = scanner.nextLong();
        a = a % b;

        long temp;
        while (true) {
            temp = Math.abs(a - b);
            if (temp >= a) {
                System.out.println(a);
                return;
            }
            a = temp;
        }
    }

}