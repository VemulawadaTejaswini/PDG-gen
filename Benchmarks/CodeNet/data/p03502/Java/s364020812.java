import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] a = str.toCharArray();
        int sum = 0;
        for (char c : a) {
            sum += Character.getNumericValue(c);
        }
        if (Integer.parseInt(str) % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
