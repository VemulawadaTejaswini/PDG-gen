import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int T = 0;
        int K = 0;
        for(;;)
        {
            if(C<=0)
            {
                T++;
                break;
            }
            if(A<=0)
            {
                K++;
                break;
            }
            A = A - D;
            K++;
            C = C - B;
            T++;
        }
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