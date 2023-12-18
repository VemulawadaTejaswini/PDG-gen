import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        long M = scan.nextLong();
        long all = N * 2 + M;
        long answer = all / 4;
        System.out.println(answer);
    }
}
