import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt(), A = in.nextInt(), B = in.nextInt();
        System.out.println(A % K == 0 || A / K < B / K ? "OK" : "NG");
    }
}