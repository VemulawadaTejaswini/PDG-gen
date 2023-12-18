import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int h2 = sc.nextInt();
        int w2 = sc.nextInt();
        System.out.println((h - h2) * (w - w2));
    }
}