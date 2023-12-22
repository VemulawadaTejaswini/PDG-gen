import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b=a;
        double menseki = b * b  *3.141592/ 4;
        double enshuu = b*3.141592;
        System.out.println(menseki + " " + enshuu);
    }
}