import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String s = sc.next();
        boolean result = true;

        if (s.length()!=A+B+1) result = false;
        else if (s.charAt(A) != '-') result = false;
        else {
            String part1 = s.substring(0, A);
            String part2 = s.substring(A+1);
            if (!checkValid(part1) || !checkValid(part2)) result = false;
        }

        if (result) System.out.println("Yes");
        else System.out.println("No");
    }

    private static boolean checkValid(String s) {
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}