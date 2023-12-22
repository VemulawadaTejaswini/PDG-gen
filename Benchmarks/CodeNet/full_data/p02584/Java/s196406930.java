import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String[] XKD = sc.nextLine().split(" ");
        final Long X = Math.abs(Long.parseLong(XKD[0]));
        final Long K = Long.parseLong(XKD[1]);
        final Long D = Long.parseLong(XKD[2]);

        final Long M = X / D;
        final Long R = X % D;

        if (M > K) {
            System.out.println((M - K) * D + R);
        } else if ((K - M) % 2 == 0){
            System.out.println(R);
        } else {
            System.out.println(D - R);
        }
    }
}
