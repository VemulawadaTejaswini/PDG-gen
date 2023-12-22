import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b=a;
        double menseki = b * b  *Math.PI/ 4;
        double enshuu = b*Math.PI;
        System.out.println(menseki + " " + enshuu);
    }
}