import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        if(n % (2 * d + 1) == 0){
            System.out.println(n % (2 * d + 1));
        } else {
            System.out.println(n % (2 * d + 1) + 1);
        }
    }
}
