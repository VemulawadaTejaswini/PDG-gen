import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int min = Integer.MAX_VALUE;

        while (true) {
            s = s.replaceAll("01", "");
            s = s.replaceAll("10", "");
            if (min > s.length()) {
                min = s.length();
            } else {
                break;
            }
        }

        System.out.println(n - min);
    }
}