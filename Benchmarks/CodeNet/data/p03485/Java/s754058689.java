import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        double sum = num1 + num2;
        double avg = sum/2;
        System.out.println((int)Math.ceil(avg));
    }
}
