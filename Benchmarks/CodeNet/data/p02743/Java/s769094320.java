import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int AA = A*A;
        int BB = B*B;
        int CC = C*C;
        if ((AA + BB) < CC) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}