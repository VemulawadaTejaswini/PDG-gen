import java.util.*;

public class Main {
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        System.out.println(n % 500 <= a ? "Yes" : "No");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
