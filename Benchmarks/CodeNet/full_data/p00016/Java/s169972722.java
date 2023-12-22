import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0, y = 0;
        int d = 90;
        while (true) {
            String[] lines = sc.next().split(",");
            int n = Integer.parseInt(lines[0]);
            int m = Integer.parseInt(lines[1]);
            if (n == 0 && m == 0)
                break;

            x += n*Math.cos(Math.toRadians(d));
            y += n*Math.sin(Math.toRadians(d));
            d -= m;

        }
        System.out.println((int)x);
        System.out.println((int)y);
    }
}
