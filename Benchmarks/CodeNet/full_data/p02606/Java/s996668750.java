
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt(), d = sc.nextInt();
        System.out.println(r/d-(l-1)/d);
    }
}
