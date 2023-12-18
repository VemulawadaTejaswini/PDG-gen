import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        sc.close();

        double ave = (a + b) / 2.0;

        int ans = (int) Math.ceil(ave);

        System.out.println(ans);

    }

}
