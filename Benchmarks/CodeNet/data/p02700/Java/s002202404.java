import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int T = C / B;
        int K = A / D; 
        if(T>K)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
