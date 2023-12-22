import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        int bottom = (l%d == 0) ? 1 : 0;
        System.out.println(r/d - l/d + bottom);
    }
}