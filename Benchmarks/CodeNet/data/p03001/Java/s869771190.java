import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long W = scan.nextLong();
        long H = scan.nextLong();
        long x = scan.nextLong();
        long y = scan.nextLong();
        double area = ((double) W * H) / 2;
        int multiple = W == 2 * x && H == 2 * y ? 1 : 0;
        System.out.println(String.format("%.10f",area) + " " + multiple);
    }
}