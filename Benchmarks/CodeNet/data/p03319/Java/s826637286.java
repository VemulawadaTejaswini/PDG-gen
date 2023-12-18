import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        for(int i = 0; i < n; i++) scan.nextInt();
        n -= k;
        System.out.println((n + k - 2) / (k - 1) + 1);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
