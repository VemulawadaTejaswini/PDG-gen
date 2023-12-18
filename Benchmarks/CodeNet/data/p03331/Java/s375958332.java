import java.util.*;

public class Main
{
    public static int smallest(int n) {
        int ret = Integer.MAX_VALUE;
        for (int i = 1; i <= n/2; i++) {
            int k = i;
            int j = n - i;
            int n1 = 0;
            while (k != 0) {
                n1 += (k % 10);
                k /= 10;
            }
            int n2 = 0;
            while (j != 0) {
                n2 += (j % 10);
                j /= 10;
            }
            ret = Math.min(ret, n1 + n2);
        }
        return ret;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(smallest(n));

    }

}
