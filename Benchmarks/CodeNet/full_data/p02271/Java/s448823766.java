import java.util.*;

public class Main {
    public static int n = 0;
    public static int[] data = new int[20];
    public static int q = 0;
    public static int[] target = new int[200];

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        n = num.nextInt();

        for(int i = 0; i < n; i++) {
            data[i] = num.nextInt();
        }

        q = num.nextInt();

        for(int i = 0; i < q; i++) {
            target[i] = num.nextInt();
        }

        if(num != null) {
            num.close();
        }

        for(int i = 0; i < q; i++) {
            if(calc(0, target[i])) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean calc(int sum, int m) {
        if(m == 0) {
            return true;
        }
        if(sum >= n) {
            return false;
        }
        return calc(sum + 1, m) || calc(sum + 1, m - data[sum]);
    }
}
