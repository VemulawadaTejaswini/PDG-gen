import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maisuu = scanner.nextInt();
        int sougaku = scanner.nextInt();

        if (500 * maisuu >= sougaku){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
