import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans1 = (int)Math.ceil((double) n / 1.08);

        System.out.println((int)Math.floor(ans1 * 1.08) == n ? ans1 : ":(");
    }
}
