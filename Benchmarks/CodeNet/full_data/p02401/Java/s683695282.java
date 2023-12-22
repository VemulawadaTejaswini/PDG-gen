import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            String[] lines = line.split(" ");
            int a = Integer.parseInt(lines[0]);
            String op = lines[1];
            int b = Integer.parseInt(lines[2]);
            if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            } else if (op.equals("*")) {
                System.out.println(a * b);
            } else if (op.equals("/")) {
                System.out.println(a / b);
            } else {
                break;
            }
        }
    }
}

