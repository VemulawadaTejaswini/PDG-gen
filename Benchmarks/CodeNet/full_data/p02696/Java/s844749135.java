import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int ancer=0;
        for (int x = 1; x <=c; x++) {
            ancer = floor(a * x / b) + a * floor(x / b);

        }
        System.out.println(ancer);
    }
    public static int floor(double n) {
        return (int)n;
    }

}