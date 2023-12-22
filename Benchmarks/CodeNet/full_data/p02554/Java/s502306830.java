import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = (long)(Math.pow(2, n) - 2) % ((long)Math.pow(10, 9) + 7);
        System.out.println(ans);
    }
}