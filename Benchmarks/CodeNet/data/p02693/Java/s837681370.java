import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        while (A <= B) {
            if (A % K == 0) {
                System.out.println("OK");
                return;
            }
            A++;
        }
        System.out.println("NG");
    }
}
