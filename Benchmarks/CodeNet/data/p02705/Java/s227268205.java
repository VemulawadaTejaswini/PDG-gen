import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        double x = Math.PI;
        System.out.println(2 * r * x);
        sc.close();
    }

}
