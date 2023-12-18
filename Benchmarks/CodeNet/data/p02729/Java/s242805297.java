import java.util.Scanner;

public class sumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int sum = 0;

        while (N != 0) {
            sum += --N;
        }

        System.out.println(sum + M);
    }
}