import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double n = stdIn.nextDouble();
        double d = stdIn.nextDouble();
        System.out.println((int)(Math.ceil(n / (2 * d + 1))));

    }
}