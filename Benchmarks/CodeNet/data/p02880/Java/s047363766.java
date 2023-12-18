import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ans = "No";

        for (int i = 1; i < 10; i++) {
            int another = n / i;
            if (n % i == 0 && another < 10 && another > 0) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);
    }
}