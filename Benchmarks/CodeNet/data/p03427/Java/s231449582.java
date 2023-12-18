import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        ArrayList<Integer> digits = new ArrayList<>();
        for (char i : x.toCharArray()) {
            digits.add(i - '0');
        }
        int ans = digits.stream().mapToInt(i -> i).sum();
        for (int i = 0; i < x.length(); i++) {
            if (digits.get(i) != 0) {
                ans = Math.max(ans, digits.stream().limit(i).mapToInt(j -> j).sum() + digits.get(i) - 1 + (x.length() - i - 1) * 9);
            }
        }
        System.out.println(ans);
    }
}
