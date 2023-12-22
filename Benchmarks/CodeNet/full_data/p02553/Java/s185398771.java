import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long d = scan.nextInt();
        long out = a * c;
        out = Math.max(out, a * d);
        out = Math.max(out, b * c);
        out = Math.max(out, b * d);
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
