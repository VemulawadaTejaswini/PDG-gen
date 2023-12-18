import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int X = A * N;
        
        if(X < B){
            System.out.println(X);
        } else {
            System.out.println(B);
        }
        
        sc.close();
        
    }
}
