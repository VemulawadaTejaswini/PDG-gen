import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        boolean found = false;
        int whitecount = 0;
        for(int i = 0; i < N; i++) {
            if (found && data[i] == '.') {
                whitecount += 1;
            }
            if (data[i] == '#') {
                found = true;
                continue;
            }
        }
        System.out.println(whitecount);
    }
}
