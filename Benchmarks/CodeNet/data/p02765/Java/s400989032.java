import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        r += n >= 10 ? 0 : (10-n) * 100;
        System.out.println(r);
    }
}
