import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.valueOf(sc.nextInt());
        double b = Double.valueOf(sc.nextInt());
        double n = Double.valueOf(sc.nextInt());

        long max = 0;

        for (double i = 1; i <= n; i++) {
            long tmp = (long) (Math.floor((a * i) / b) - (a * (Math.floor(i / b))));
            if (tmp >= max) {
                max = tmp;
            }
        }

        System.out.println(max);    

    }
}
