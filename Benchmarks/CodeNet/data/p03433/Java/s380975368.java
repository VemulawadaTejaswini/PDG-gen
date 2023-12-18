import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();

        int haraeru = (N - A) % 500;
        if (haraeru == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}