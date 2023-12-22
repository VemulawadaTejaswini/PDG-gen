import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        for(;;){
            C = Attack(C,B);
            if(C<=0){
                System.out.println("Yes");
                break;
            }
            A = Attack(A,D);
            if(A<=0){
                System.out.println("No");
                break;
            }
        }
    }
    public static int Attack(int H, int A){
        H -= A;
        return H;
    }
}
