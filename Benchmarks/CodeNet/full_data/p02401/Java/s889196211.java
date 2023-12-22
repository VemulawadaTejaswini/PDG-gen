import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        String op = inp.next();
        int b = inp.nextInt();

        while (!op.equals("?")) {
            switch(op) {
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
            }

            a = inp.nextInt();
            op = inp.next();
            b = inp.nextInt();
        }
    }
}

