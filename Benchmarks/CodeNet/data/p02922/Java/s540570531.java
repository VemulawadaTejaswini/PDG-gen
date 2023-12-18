import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(), B = in.nextInt();
        System.out.println(B % A == 0 ? B / A : B / A + 1);
    }
}
