import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (13 <= A) {
            System.out.println(B);
        } else if (6 <= A) {
            System.out.println(B/2);
        } else {
            System.out.println(0);
        }
    }
}
