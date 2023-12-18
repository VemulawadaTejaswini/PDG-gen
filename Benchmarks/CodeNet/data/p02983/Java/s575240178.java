import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int result = 0;
        int x = l / 2019;
        if (!(l - l * x <= 2019 && r - r * x >= 2019)) {
            result = (l % 2019) * ((l + 1) % 2019) % 2019;
        }

        System.out.println(result);
    }
}
