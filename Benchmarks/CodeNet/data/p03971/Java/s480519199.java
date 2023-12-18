import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner dis = new Scanner(System.in);
        int n = dis.nextInt(), a = dis.nextInt(), b = dis.nextInt();
        String s = dis.next();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                a--;
                if (a + b >= 0) System.out.println("Yes");
                else System.out.println("No");
            } else if (c == 'b') {
                b--;
                if (a + b >= 0 && b >= 0) System.out.println("Yes");
                else System.out.println("No");
            } else System.out.println("No");
        }
    }
}