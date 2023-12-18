import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String A = scan.next();
        String B = scan.next();
        String C = scan.next();
        char a_l = A.toCharArray()[A.length()-1];
        char b_f = B.toCharArray()[0];
        char b_l = B.toCharArray()[B.length()-1];
        char c_f = C.toCharArray()[0];
        boolean answer = false;
        if (a_l == b_f && b_l == c_f) {
            answer = true;
        }
        System.out.println(answer ? "YES" : "NO");
    }
}
