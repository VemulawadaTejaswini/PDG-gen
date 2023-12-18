import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double H = (double)sc.nextInt();
        double A = (double)sc.nextInt();

        System.out.println((int)Math.ceil(H/A));

    }
}
