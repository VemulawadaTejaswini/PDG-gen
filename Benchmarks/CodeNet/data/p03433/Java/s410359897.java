import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();

        int gohyakuen = N / 500;

        int haraeru = N - gohyakuen * 500 - A;
        if (haraeru < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}