import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = (x / 11) * 2;
        x = x % 11;
        if(x > 0 && x <= 6) ans++;
        else if(x > 6) ans += 2;
        
        System.out.println(ans);
    }
}
