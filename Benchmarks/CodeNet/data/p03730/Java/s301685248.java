import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        boolean found = false;
        for (int i = 1; i <= B; i++) {
            if ((i * A) % B == C) {
                found = true;
            }
        }
        System.out.println(found? "YES" : "NO");
    }
}
