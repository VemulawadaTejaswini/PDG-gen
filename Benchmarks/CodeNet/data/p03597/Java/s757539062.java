import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // n*nマス
        int n = Integer.parseInt(sc.next());
        // 白色のマス数
        int white = Integer.parseInt(sc.next());
        // 黒色のマス
        int black = n * n - white;
        System.out.println(black);
    }
}
