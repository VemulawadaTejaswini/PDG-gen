import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var a = scaner.nextInt();
        var b = scaner.nextInt();
        var c = scaner.nextInt();
        var k = scaner.nextInt();

        long ans = 0;


        if (a < k) {
            ans += a;
            k -= a;
        } else {
            ans += k;
            k -= k;
        }
        
        if (b <= k) {
            k -= b;
        } else {
            k = 0;
        }

        ans += (-1 *k);


        System.out.println(ans);
        scaner.close();
    }

}
