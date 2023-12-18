import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        int a = Integer.parseInt(input.substring(0, 1));
        int b = Integer.parseInt(input.substring(1, 2));
        int c = Integer.parseInt(input.substring(2, 3));
        int d = Integer.parseInt(input.substring(3, 4));

        String op[] = {"+", "-"};
        String op1 = "";
        String op2 = "";
        String op3 = "";
        // 7 = a +- b +- c +- d
        boolean ans = false;
        for (int i = 0; i < 2; i++) {
            op1 = op[i];
            int z = 0;
            if (op1.equals("+")) {
                z = a+b;
            } else {
                z = a-b;
            }
            for (int j = 0; j < 2; j++) {
                op2 = op[j];
                if (op2.equals("+")) {
                    z = z+c;
                } else {
                    z = z-c;
                }
                for (int k = 0; k < 2; k++) {
                    op3 = op[k];
                    if (op3.equals("+")) {
                        z = z+d;
                    } else {
                        z = z-d;
                    }
                    if (z == 7) {
                        ans = true;
                        break;
                    }
                }
                if (ans) {
                    break;
                }
            }
            if (ans) {
                break;
            }
        }
        System.out.println(a+op1+b+op2+c+op3+d+"=7");
    }
}
