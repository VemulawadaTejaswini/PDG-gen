import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        double b100 = b * 100L;
        long b100long = (long) b100;
        System.out.println(a * b100long / 100);
    }

}
