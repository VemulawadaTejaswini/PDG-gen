import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        System.out.println((int)Math.ceil((double)h / (double)a));
    }
}
