import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long sum = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String a = "";
            int x = 0;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    a = s.substring(x, j + 1);
                    sum += Long.parseLong(a);
                    x = j + 1;
                }
            }
            a = s.substring(x);
            sum += Long.parseLong(a);
        }
        System.out.println(sum);
    }
}
