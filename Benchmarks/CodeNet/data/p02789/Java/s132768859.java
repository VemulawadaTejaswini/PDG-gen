
import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_152_A();
        
        return;
    }

    private static void solve_152_A() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if(N==M) System.out.println("Yes");
        else System.out.println("No");
    }
}