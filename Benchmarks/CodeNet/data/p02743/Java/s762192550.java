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
        if (fAB < CAB * CAB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}