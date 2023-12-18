import java.util.Scanner;

public class RingoFavouriteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        if (n <= 99)
            ans = (int) (Math.pow(100, d)) * n;
        else
            ans = (int) (Math.pow(100, d)) * 101;
        System.out.println(ans);
    }
}
