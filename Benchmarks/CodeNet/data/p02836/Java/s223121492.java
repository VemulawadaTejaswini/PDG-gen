import java.io.BufferedInputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        String input = sc.next();
        int sum = 0;
        int n  = input.length();
        for (int i = 0; i < input.length()/2; i++) {
            if(input.charAt(i) != input.charAt(n-i-1)) sum++;
        }
        System.out.println(sum);
    }

    private static int solve(String s, int n) {
        return n;
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
}