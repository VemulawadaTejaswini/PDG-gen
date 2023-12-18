import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(((N-1) + (K - 2)) / (K-1));
    }
}
