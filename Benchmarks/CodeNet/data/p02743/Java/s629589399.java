import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        double a = Math.sqrt(scan.nextInt());
        double b = Math.sqrt(scan.nextInt());
        double c = Math.sqrt(scan.nextInt());
        System.out.println(a + b < c ? "Yes" : "No");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
