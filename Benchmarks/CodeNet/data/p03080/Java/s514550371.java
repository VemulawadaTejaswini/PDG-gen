import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static int q    ;

    public static void main(String[] args) {
        int a = input.nextInt();
        System.out.println(a);

        String b = input.next();
        System.out.println(b.length());

        for(int i = 0; i < b.length(); i++) {
            Character c = b.charAt(i);

            if (c.equals('R')) {
                q = q + 1;
            }
        }

            if (q > (a/2)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
    }
}
