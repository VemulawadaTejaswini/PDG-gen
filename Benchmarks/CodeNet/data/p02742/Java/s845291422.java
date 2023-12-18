import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextInt();
        long w = in.nextInt();
        System.out.println((long)Math.ceil(h * w / 2.0));
    }
}
