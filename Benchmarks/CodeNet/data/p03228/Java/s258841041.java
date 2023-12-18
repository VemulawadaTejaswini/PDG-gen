import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A,B,K;
        A = sc.nextInt();
        B = sc.nextInt();
        K = sc.nextInt();
        int count = 0;
        for(int i = 0; i < K; i++){
            if(count%2 == 0){
                A /= 2;
                B += A;
            }else{
                B /= 2;
                A += B;
            }
            count++;
        }
        System.out.println(A);
        System.out.println(B);
    }
}
