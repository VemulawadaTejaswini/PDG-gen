import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long k = x;
        long cnt = 0;
        while (k <= y) {
            if (!(k >= x && k <= y)) {
                break;
            }
            k *= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
