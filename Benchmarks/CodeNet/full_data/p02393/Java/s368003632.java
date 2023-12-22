import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] n = new int[3];
        n[0] = in.nextInt();
        n[1] = in.nextInt();
        n[2] = in.nextInt();

        Arrays.sort(n);

        System.out.println(n[0] + " " + n[1] + " " + n[2]);
    }
}