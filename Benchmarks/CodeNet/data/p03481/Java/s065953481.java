import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        long ans = 0;
        long tmp = X;
        for (int i = 0; i < Y; i++) {
            if (tmp > Y) {
                break;
            }
            ans++;
            tmp *= 2;
        }
        System.out.println(ans);
    }
}
