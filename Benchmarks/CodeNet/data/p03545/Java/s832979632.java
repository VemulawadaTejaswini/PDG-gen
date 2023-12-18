import java.util.Scanner;

public class Main {

    private static boolean calc7(int a, int b, int c, int d, String op1, String op2, String op3) {
        int e = 0;
        e = op1.equals("+") ? (a+b) : (a-b);
        e = op2.equals("+") ? (e+c) : (e-c);
        e = op3.equals("+") ? (e+d) : (e-d);

        if (e == 7) {
            System.out.println(a+op1+b+op2+c+op3+d+"=7");
            System.exit(0);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sn = sc.next().split("");
        int a = Integer.parseInt(sn[0]);
        int b = Integer.parseInt(sn[1]);
        int c = Integer.parseInt(sn[2]);
        int d = Integer.parseInt(sn[3]);

        calc7(a, b, c, d, "+", "+", "+");
        calc7(a, b, c, d, "+", "+", "-");
        calc7(a, b, c, d, "+", "-", "+");
        calc7(a, b, c, d, "+", "-", "-");
        calc7(a, b, c, d, "-", "+", "+");
        calc7(a, b, c, d, "-", "+", "-");
        calc7(a, b, c, d, "-", "-", "+");
        calc7(a, b, c, d, "-", "-", "-");
    }

}