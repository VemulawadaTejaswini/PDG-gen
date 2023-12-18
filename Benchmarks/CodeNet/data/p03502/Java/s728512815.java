import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nStr = Integer.toString(n).split("");

        int sum = 0;
        for (int i = 0; i < nStr.length; i++) {
            sum += Integer.valueOf(nStr[i]);
        }

        boolean ans = false;
        if (n % sum == 0) ans = true;

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
