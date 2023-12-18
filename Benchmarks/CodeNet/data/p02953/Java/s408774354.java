import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String ans = "Yes";

        int n = sc.nextInt();
        boolean used = false;

        int lastValue = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();
            if (value < lastValue) {
                if (lastValue - value == 1 && !used) {
                    used = true;
                } else {
                    ans = "No";
                    break;
                }
            }
            lastValue = value;
        }

        System.out.println(ans);
    }
}
