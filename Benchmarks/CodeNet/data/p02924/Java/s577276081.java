import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        System.out.println(n * (n - 1)/ 2);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
