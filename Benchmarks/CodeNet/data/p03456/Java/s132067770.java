import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int c = Integer.parseInt(a + b);
        int sq = (int)Math.sqrt(c);

        if (c == sq * sq) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
