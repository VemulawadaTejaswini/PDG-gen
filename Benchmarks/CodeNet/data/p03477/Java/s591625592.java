import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        a += b;
        c += d;
        if (a == c) System.out.println("Balanced");
        else if (a > c) System.out.println("Left");
        else System.out.println("Right");
    }
}