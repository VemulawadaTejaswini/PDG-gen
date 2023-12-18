import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int ans = 0;
        if(A <= K){
            ans = A;
            K -= A;
        }else{
            ans = K;
            K = 0;
        }
        if(B <= K){
            K -= B;
        }else{
            K = 0;
        }
        ans -= K;

        System.out.println(ans);
    }
}

