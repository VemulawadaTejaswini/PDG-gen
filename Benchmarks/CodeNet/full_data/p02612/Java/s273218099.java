import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = n % 1000;
        if (ans == 0) ans = 1000;
        System.out.println(1000 - ans);
    }
}