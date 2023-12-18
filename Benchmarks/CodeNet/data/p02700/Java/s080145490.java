import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());

        while (true) {
            A = A - D;
            C = C - B;
            if (A <= 0) {
                System.out.println("Yes");
                return;
            } else if (C <= 0) {
                System.out.println("No");
                return;
            }
        }

    }
}