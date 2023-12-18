import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(N * (N - 1) / 2 + M * (M - 1) / 2);
    }
}
