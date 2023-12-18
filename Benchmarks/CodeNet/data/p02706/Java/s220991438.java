import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int homeworks = sc.nextInt();
        int days = 0;
        for (int i = 0; i < homeworks; i++) days += sc.nextInt();
        System.out.println(Math.max(-1, n - days));
    }
}