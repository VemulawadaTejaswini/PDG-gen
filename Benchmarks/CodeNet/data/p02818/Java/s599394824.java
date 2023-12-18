import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_149_B();
      
        return;
    }

    private static void solve_149_B() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        for(int i=0; i<K; i++){
            if( A>=1 ){
                A--;
            }else if( B>=1 ){
                B--;
            }else{
                // Nothing
            }
        }
        System.out.println(A + " " + B);
    }
}