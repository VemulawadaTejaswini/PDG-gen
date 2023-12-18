import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = (int)Math.ceil((double)n/((2 * m)+1));
        System.out.println(ans);

    }
}

