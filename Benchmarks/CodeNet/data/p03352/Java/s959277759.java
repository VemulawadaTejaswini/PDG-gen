import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int max = 0;
        for (int i = 1; i < 32; i++) {
            for (int j = 2; j < 10; j++) {
                int beki = (int) Math.pow(i, j);
                if (beki > x) {
                    continue;
                }

                max = Math.max(beki, max);
            }
        }
        System.out.println(max);
    }
}