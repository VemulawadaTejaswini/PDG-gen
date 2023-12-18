import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String t = scan.next();
        char a = t.toCharArray()[0];
        t = scan.next();
        char b = t.toCharArray()[0];
        char answer = ' ';
        if (a == 'H') {
            answer = b;
        } else {
            answer = b == 'H' ? 'D' : 'H';
        }
        System.out.println(answer);
    }
}
