import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 123/** sc.nextInt() */
        ;
        int B = 456/** sc.nextInt() */
        ;
        sc.close();

        int judge = 0;

        for (int i = 1; i <= B; i++) {
            judge = A * i;
            if (i == 150) {
                System.out.println();
            }
            if (judge % B == 0) {
                break;
            }
        }

        System.out.println(judge);
    }

}