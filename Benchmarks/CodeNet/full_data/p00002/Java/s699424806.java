import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = Integer.parseInt(sc.next()) + Integer.parseInt(sc.next());
            int ans = 1;

            while (num / 10 != 0) {
                ans++;
                num /= 10;
            }
            System.out.println(ans);
        }
    }
}