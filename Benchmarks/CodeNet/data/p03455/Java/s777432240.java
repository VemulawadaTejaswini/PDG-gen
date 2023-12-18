import java.util.*;

public class Main {
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt() % 2;
        int b = scan.nextInt() % 2;
        System.out.println(a * b == 0 ? "Even" : "Odd");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
