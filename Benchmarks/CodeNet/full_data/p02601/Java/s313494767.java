import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int k = in.nextInt();

        int count = 0;
        while (b <= a) {
            b *= 2;
            count++;
        }

        while (c <= b) {
            c *= 2;
            count++;
        }

        if (count <= k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}