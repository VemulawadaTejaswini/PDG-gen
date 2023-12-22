import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            int m = sc.nextInt();
            if (str == ("-"))
                break;
            for (int i = 0; i < m; i++) {
                int h = sc.nextInt();
                String left = str.substring(0, h);
                String right = str.substring(h);
                str = right + left;
            }
            System.out.println(str);
        }
    }
}
