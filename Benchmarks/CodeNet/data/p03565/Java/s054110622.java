import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String Sprime = sc.next();
        String T = sc.next();
        check:
        for (int i = Sprime.length() - T.length(); i >= 0; i--) {
            for (int j = 0; j < T.length(); j++) {
                if (T.charAt(j) == Sprime.charAt(i + j) || Sprime.charAt(i + j) == '?') {
                } else {
                    continue check;
                }
            }
            for (int j = 0; j < Sprime.length(); j++) {
                if (j >= i && j < i + T.length()) {
                    System.out.print(T.charAt(j - i));
                } else if (Sprime.charAt(j) == '?') {
                    System.out.print('a');
                } else {
                    System.out.print(Sprime.charAt(j));
                }
            }
            System.out.println();
            return;
        }
        System.out.println("UNRESTORABLE");
    }
}
