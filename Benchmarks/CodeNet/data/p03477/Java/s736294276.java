import java.util.*;
import java.math.*;

public class Main {
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt() + scan.nextInt();
        int b = scan.nextInt() + scan.nextInt();
        if(a == b) System.out.println("Balanced");
        else System.out.println(a > b ? "Left" : "Right");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
