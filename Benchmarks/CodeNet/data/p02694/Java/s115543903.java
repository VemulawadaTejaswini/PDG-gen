import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final long x = in.nextLong();
        int res = 0;
        long curr = 100;
        while (curr < x) {
            curr += curr / 100;
            res++;
        }
        System.out.println(res);
    }
}
