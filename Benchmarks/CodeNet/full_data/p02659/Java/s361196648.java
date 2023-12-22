import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble(), b = sc.nextDouble();
            long first = (long) a;
            int mul = (int) (b * 100);
            long sum = first * (mul) / 100;
            System.out.println(sum);
        }
    }
}