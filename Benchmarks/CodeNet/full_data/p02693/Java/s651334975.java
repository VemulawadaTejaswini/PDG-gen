import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), n = in.nextInt(), m = in.nextInt();
        if (x * (m / x) >= n) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }

}
