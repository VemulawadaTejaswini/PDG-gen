import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        String ans = "";
        int tmp = y - 2 * x;
        if (tmp % 2 == 0 && x - tmp >= 0) ans = "Yes";
        else ans = "No";

        System.out.println(ans);
    }
}