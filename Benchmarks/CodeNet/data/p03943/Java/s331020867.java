import java.util.Scanner;

public class a_FightingOverCandies {

    static Scanner scanner;
    static int a, b, c;

    public static void main(String[] args){
        scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        candy_divide();
    }

    private static void candy_divide() {
        if ( a + b == c || a + c == b || b + c == a){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
