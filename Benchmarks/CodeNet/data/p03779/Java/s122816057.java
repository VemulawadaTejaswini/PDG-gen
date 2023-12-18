import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        int ans = 0;
        for (int i = 1; i <= x; i++) {
            double t = (i * (i + 1)) / 2.0;
            if (t >= x) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}