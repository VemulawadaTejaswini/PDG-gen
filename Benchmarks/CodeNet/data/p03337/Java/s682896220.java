import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(Math.max(a - b, Math.max(a * b, a + b)));
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}