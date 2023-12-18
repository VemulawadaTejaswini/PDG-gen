import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int ret = 0;

        ret += Math.max(Math.max(A, B), C) * 10;

        ret += A + B + C - ret/10;

        System.out.println(ret);

    }
}