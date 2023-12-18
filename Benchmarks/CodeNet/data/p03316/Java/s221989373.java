import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] num = n.toCharArray();
        int sum = 0;
        for (char c : num) {
            sum += Character.getNumericValue(c);
        }
        if (Integer.parseInt(n) % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
