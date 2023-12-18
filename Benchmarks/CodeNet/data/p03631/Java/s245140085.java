import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static String solve(String x) {
        String rev = "";
        for (int i = 2; i >= 0; i--){
            rev += x.charAt(i);
        }
        return (x.equals(rev) ? "Yes": "No");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        System.out.println(solve(s));
    }
}
