import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int k = input.nextInt();
        int ans = 0;
        int count = 0;
        int tmp;
        tmp = Math.min(a,k);
        count += tmp * 1;
        ans += tmp * 1;
        k = Math.max(k-tmp,0);
        tmp = Math.min(b,k);
        count += tmp * 1;
        ans += tmp * 0;
        k = Math.max(k-tmp,0);
        tmp = Math.min(c,k);
        count += tmp * 1;
        ans -= tmp * 1;
        k = Math.max(k-tmp,0);
        System.out.println(ans);
    }
}