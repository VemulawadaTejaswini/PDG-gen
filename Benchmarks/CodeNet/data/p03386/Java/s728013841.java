import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        for(int i = A; i < A + K; i++){
            System.out.println(i);
        }
        for(int i = B; i > B - K; i--){
            System.out.println(i);
        }
    }
}
