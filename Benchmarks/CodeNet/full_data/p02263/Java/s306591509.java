
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        String[] exp = sc.nextLine().split(" ");
        int oper;
        for (int i = 0; i < exp.length; i++) {
            if (esnumero(exp[i])) {
                pila.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        pila.push(pila.pop() + pila.pop());
                        break;
                    case "-":
                        int a,
                         b;
                        a = pila.pop();
                        b = pila.pop();
                        pila.push(b - a);
                        break;
                    default:
                        pila.push(pila.pop() * pila.pop());
                }
            }
        }
        System.out.println(pila.pop());
    }

    static boolean esnumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}

