import java.util.*;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        ans = a + b + c - Math.max(a,Math.max(b,c));
        System.out.print(ans);
    }
}