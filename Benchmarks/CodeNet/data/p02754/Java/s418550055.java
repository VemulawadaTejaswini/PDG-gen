import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int divide = (int) N/(A+B);
        int ans = 0;
        ans += divide * A;

        if(N%(A+B) >= A){
            ans += A;
        }else{
            ans += N%(A+B);
        }

        System.out.println(ans);


    }

}
