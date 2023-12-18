import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        b -= a;
        System.out.println(1 + b / (a - 1) + b % (a - 1));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
