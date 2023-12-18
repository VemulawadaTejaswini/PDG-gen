import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        System.out.println(solve(s));
    }
    public static int solve(String s) {
        char[] data = s.toCharArray();
        int answer = 0;
        for(char c : data) {
            answer += c == '+' ? 1 : -1;
        }
        return answer;
    }
}
