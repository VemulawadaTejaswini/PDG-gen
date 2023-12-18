import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        int a, b, x, ret;
        in = scanner.nextLine().split(" ");
        a = Integer.parseInt(in[0]);
        b = Integer.parseInt(in[1]);

        ret = 0;
        for (int i = a; i <= b; i++) {
            ret = Math.abs(~(i & (i+1)));
        }

        System.out.println(ret);
    }
}