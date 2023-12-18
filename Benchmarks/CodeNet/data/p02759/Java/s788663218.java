import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int ans = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        System.out.println(ans);
    }
}