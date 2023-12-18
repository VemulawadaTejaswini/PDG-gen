import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int x = l * (l / 2019);
        if (l - x <= 2019 && r - x >= 2019) {
            System.out.println(0);
        } else {
            int min = 2018;
            for (int i = l - x; i < r - x; i++) {
                min = Math.min(min, (l % 2019) * ((l + 1) % 2019) % 2019);
            }
            System.out.println(min);
        }
    }
}
