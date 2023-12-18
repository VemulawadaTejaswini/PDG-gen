import java.util.*;

public class Main {
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() - scan.nextInt();
        n %= scan.nextInt();
        System.out.println(n);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
