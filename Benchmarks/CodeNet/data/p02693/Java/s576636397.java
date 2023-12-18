import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = (B / K) * K;
        System.out.println(A <= ans && ans <= B ? "OK" : "NG");
    }
}