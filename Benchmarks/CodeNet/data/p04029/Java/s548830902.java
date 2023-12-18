import java.util.Scanner;

/**
 * ABC043A
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int candies = 0;
        for (int i = 1; i <= N; i++) {
            candies += i;
        }

        System.out.println(candies);
        sc.close();
    }
}