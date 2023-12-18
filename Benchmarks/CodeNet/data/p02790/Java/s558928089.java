import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.min(a, b);
        for (int i = 0 ; i < Math.max(a, b) ; i++) {
            System.out.print(Math.min(a, b));
        }
    }

}
