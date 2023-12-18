import java.util.Scanner;

//4AABB < (CC - AA - BB)(CC - AA - BB)

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int AA = A*A;
        int BB = B*B;
        int CC = C*C;
        int fAB = 4*AA*BB;
        int CAB = CC - AA -BB;
        if (CAB < 1 || CAB * CAB < fAB) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}