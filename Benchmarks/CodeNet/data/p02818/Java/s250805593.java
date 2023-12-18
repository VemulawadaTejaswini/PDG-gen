import java.util.Scanner;;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        for (int i=0; i < K; i++) {
            if (A >= 1) {
                A = A - 1;
            } else if (A == 0) {
                if (B >= 1) {
                    B = B - 1;
                }
            }
        }
        System.out.println(A + " " + B);
    }
}