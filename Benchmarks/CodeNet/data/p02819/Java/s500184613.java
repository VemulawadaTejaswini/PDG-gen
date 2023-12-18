import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_149_C();
      
        return;
    }

    private static void solve_149_C() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int prime = A;
        boolean judge = true;

        do {
            judge = true;   // Initialize
            for (int i = 2; i * i <= prime; i++) {
                if ((prime % i) == 0) {
                    judge = false;
                    prime++;
                    break;
                }
            }
        }while(!judge);

        if(true == judge) {
            System.out.println(prime);
        }
    }
}