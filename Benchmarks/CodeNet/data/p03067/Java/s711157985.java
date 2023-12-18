import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A < B && B < C){
            System.out.println("No");
        }else if(C < A && C < B){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
