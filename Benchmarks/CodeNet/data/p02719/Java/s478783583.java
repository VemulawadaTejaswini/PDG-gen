import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long K = sc.nextLong();
        while (N > K) {
            N = Math.abs(N-K);
            System.out.println(N);
        }
        System.out.println(N);
    }
}
