import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int left = 0;
        int under = 0;
        int width = scan.nextInt();
        int height = scan.nextInt();
        int n = scan.nextInt();
        int x;
        int y;
        int a;
        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            a = scan.nextInt();
            switch (a) {
                case 1:
                    if (left < x) {
                        left = x;
                    }
                    break;
                case 2:
                    if (width > x) {
                        width = x;
                    }
                    break;
                case 3:
                    if (under < y) {
                        under = y;
                    }
                    break;
                case 4:
                    if (height > y) {
                        height = y;
                    }
                    break;
            }
        }
        int area = (width - left) * (height - under);
        if (area >= 0) {
            System.out.println(area);
        } else {
            System.out.println(0);
        }
    }
}
