import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        int bis = 0;

        bis = b*(t/a);
        System.out.println(bis);

        sc.close();
    }
}