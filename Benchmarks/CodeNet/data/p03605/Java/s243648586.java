import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 10 == 9 || n / 10 == 9) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}