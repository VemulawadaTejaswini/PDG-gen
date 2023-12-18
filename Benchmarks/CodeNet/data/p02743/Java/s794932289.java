import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int ABf = 4*A*B;
        int CAB = (C-A-B);
        int CABd = CAB * CAB;
        if (CAB < 1 || ABf < CABd) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
    }
}