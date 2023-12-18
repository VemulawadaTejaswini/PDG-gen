import java.util.Scanner;

public class Main {
    public static void main(int args[]) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        if(A != B && B != C) {
            System.out.println("No");
        } else if(A == B && B == C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
