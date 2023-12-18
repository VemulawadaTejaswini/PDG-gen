import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        long min = (long)(A * (N-1) + B);
        long max = (long)(A + B * (N-1));
        long ans = (long)(max - min + 1);

        System.out.println(Math.max(0, ans));

    }
}