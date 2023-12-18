import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int X = A + B + C;

        if(X > 21) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}