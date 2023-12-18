import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int x = scanner.nextInt();

        if (500 * k >= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
