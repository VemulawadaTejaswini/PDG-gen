import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int r = scan.nextInt();
        double π = 3.141592653589;
        System.out.println(
                String.format("%.6f",r * r * π) + " " + String.format("%.6f", (r + r) * π));
    }
}