import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
 
        for (int i = 0; i <= B; ++i){
 
            if ((A*i) % B == C){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("No");
    }       
}