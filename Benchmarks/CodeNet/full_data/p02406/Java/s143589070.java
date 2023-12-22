import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                if (i == n) {
                    System.out.println(i);
                } else {
                    System.out.print(i+" ");
                }
            }
        }
    }
}