import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += i;
        }
        for (int i = m - 1; i >= 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }

}
