import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int ans = Integer.MAX_VALUE;
        for (int i = 3; i <= s.length(); i++) {
            String subStr = s.substring(i - 3, i);
            int candidate = Integer.parseInt(subStr);
            int candidate2 = Math.abs(candidate - 753);
            if (candidate2 < ans) {
                ans = candidate2;
            }
        }
        System.out.println(ans);
    }

}
