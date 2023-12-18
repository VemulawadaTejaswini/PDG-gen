import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += A;
            if ( sum % B == C) {
                System.out.println( "Yes" );
                break;
            } 
        }

        if ( sum % B != C) 
            System.out.println( "No" );
        
        
    }
}