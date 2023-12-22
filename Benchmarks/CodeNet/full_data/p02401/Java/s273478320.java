import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA, numB;
        String op;

        while(true) {
            numA = Integer.parseInt(scan.next());
            op = scan.next();
            numB = Integer.parseInt(scan.next());

            if (op.equals("?")) break;

            if (op.equals("+")) {
                System.out.println(numA + numB);
            } else if (op.equals("-")) {
                System.out.println(numA - numB);
            }  else if (op.equals("*")) {
                System.out.println(numA * numB);
            } else {
                System.out.println(numA / numB);
            }
        }
    }
}

