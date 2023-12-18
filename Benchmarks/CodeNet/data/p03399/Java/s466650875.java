import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int ans = 0;
        if(a >= b) ans += b;
        else ans += a;
        if(c >= d) ans += d;
        else ans += c;
        System.out.println(ans);
    }
}