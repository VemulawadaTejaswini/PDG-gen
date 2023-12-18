import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x / 500;
        int a1 = x % 500;
        int b = a1 / 5;
        int h = a * 1000 + b * 5;
        System.out.println(h);

    }
}