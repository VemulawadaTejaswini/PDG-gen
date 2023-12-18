import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        System.out.println(a * a + b * b + c * c - 2 * a * b - 2 * b * c - 2 * c * a > 0 ? "Yes" : "No");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
