import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // rgb読み取り
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        int rgb = Integer.valueOf("" + r + g + b);

        if (rgb % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}