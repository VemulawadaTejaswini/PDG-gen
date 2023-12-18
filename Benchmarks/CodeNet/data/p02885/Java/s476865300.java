import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int space = A - (B * 2);

        if (space >= 0) {
            System.out.println(space);
        } else {
            System.out.println(0);
        }
    }
}