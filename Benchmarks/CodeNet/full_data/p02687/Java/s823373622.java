import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        if(S.equals("ARC"))System.out.println("ABC");
        else if(S.equals("ABC"))System.out.println("ARC");
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}