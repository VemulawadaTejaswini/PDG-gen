
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] s = in.nextLine().split(" ");
        final long first = Long.parseLong(s[0]);
        final double second = Double.parseDouble(s[1]);
        System.out.println((long) Math.floor(first * second));
    }
}
