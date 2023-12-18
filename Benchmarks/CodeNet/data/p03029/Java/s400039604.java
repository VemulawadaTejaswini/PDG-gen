import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int p = stdIn.nextInt();

        p = p + a * 3;
        int s = p / 2;
        System.out.println(s);
    }
}