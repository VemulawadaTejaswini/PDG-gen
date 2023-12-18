import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int K = scan.nextInt();
        if (K % 2 == 0) {
            System.out.println(K * K / 4);
        } else {
            int answer = K / 2 * (K / 2 + 1);
            System.out.println(answer);
        }
    }
}
