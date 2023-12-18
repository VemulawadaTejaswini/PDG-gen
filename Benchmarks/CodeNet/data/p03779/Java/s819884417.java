import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long X = scan.nextLong();
        long answer = 0;
        for (long i = 1; i <= 100000; i++) {
            if (X <= i * (i+1) / 2) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
