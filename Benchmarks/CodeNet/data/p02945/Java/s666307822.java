import java.util.*;

public class Main {
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
