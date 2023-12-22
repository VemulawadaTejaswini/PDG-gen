import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        System.out.println(10000 * (int) Math.ceil(10.0f * Math.pow(1.05f, n)));
    }
}