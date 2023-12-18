import java.util.*;

class ABC137_A_Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int out = a + b;
        if (out < a - b) out = a - b;
        if (out < a * b) out = a * b;
        System.out.print(out);
    }

}
