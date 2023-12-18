import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = 1;


            for (int j = 2 ; j <= 31 ; j++) {
                if (j == 2 || j == 3 || j == 5 || j == 7 || j == 11 || j == 13 || j == 17 || j == 19 || j == 23 || j == 29 || j == 31) {
                    int n = 1;
                    while (n * j <= x) {
                        n *= j;
                    }
                    max = Math.max(max, n);

                }

            }

        System.out.println(max);
    }

}
