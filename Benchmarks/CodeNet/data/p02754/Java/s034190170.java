import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int A = Integer.parseInt(s.next());
        int B = Integer.parseInt(s.next());
        if (A == 0) {
            System.out.println(0);
            return;
        }
        int L = A + B;
        int count = N / L;
        int mo = N % L;
        mo = mo <= A ? mo : A;
        System.out.println(count * A + mo);
    }
}