import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int da = Math.abs(x-a);
        int db = Math.abs(x-b);
        if (da < db) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
