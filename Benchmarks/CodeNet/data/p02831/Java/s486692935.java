
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //solve_148_A();
        //solve_148_B();
        solve_148_C();
        return;
    }

    private static void solve_148_C() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i=1; i<=B; i++){
            if((A * i) % B == 0){
                System.out.println(A*i);
                break;
            }
        }
    }
}