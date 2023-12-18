import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextInt();
        long w = scanner.nextInt();
        long total = h*w;
        System.out.println(total/2 + total%2);
    }
}