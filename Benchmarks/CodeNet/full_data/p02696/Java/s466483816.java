import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int max = 0;

        for (int i = 1; i <= n; i++) {
            int tmp = (int) (Math.floor((a * i) / b) - (a * (Math.floor(i / b))));
            if (tmp >= max) {
                max = tmp;
            }
        }

        System.out.println(max);    

    }
}
