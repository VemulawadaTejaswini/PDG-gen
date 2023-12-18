import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long w = sc.nextLong();

        long ans = 0L;
        long odd = h/2;
        long even = odd;
        if (h % 2L == 1L) {
            odd += 1;
        }

        ans += odd * (w / 2);
        ans += even * (w / 2);
        if (w % 2L == 1L) {
            ans += odd;
        }
        System.out.println(ans);
    }
}
