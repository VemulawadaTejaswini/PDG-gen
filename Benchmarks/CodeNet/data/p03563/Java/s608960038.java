import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int G = in.nextInt();
        System.out.println(2*G - R);
    }
}
