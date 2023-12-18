import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_152_B();
      
        return;
    }
    
    private static void solve_152_B() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long number_A = 0;
        long number_B = 0;
        
        for(int i=1; i<=b; i++) {
            number_A = (number_A*10) + a;
        }
        for(int i=1; i<=a; i++) {
            number_B = (number_B*10) + b;
        }
        
        if(number_A<number_B) System.out.println(number_A);
        else System.out.println(number_B);
    }
}