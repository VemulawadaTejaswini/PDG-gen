import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // A---B
        
        if (A <= C) {
            if (C < B && B < D) {
                System.out.println(B-C);
            } else if (C<B && D<=B) {
                System.out.println(D - C);
            } else {
                System.out.println(0);
            }
        } else {
            if (B < D) {
                System.out.println(B - A);
            } else if (D <= B) {
                System.out.println(D - A);
            } else {
                System.out.println(0);
            }
        }
    }
}