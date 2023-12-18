import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String O = sc.next();
        String E = sc.next();
        for (int i = 0; i < E.length(); i++) {
            System.out.print(O.charAt(i) + "" + E.charAt(i));
        }
        if (O.length() != E.length()) {
            System.out.print(O.charAt(O.length() - 1));
        }
    }
}
