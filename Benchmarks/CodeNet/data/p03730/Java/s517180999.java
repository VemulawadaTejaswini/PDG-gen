import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        long sum = 0;
        for (int i = 0; i <= B; ++i){
           sum += (A * i); 
            if (sum % B == C){  //条件に合致したら終了
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
        
    }       
}