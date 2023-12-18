import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        if (N == 1) {
            System.out.println("Hello World");
            return;
        } else {
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            System.out.println(A + B);
        }
    }

}
