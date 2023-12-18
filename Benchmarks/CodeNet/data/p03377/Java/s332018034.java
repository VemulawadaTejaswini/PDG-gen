import java.util.Scanner;

public class Main {
    //A - Cats and Dogs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();
        if ( A <= X && X <= A + B) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
