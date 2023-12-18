import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int res = N % B == 0 ? N / B : N / B + 1;
        System.out.println(res);
    }
}
