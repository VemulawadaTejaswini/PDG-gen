import java.util.*;

public class Main {

    public static void canPay(int N, int A) {
        if ((N % 500) <= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        canPay(N, A);
    }

}
