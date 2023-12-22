import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){
        String s = in.next();
        if(s.equals("ABC"))
            System.out.println("ARC");
        else System.out.println("ABC");
    }
}
