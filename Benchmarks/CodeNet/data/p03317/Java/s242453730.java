import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int n = Integer.parseInt(str1.split(" ")[0]);
        int k = Integer.parseInt(str1.split(" ")[1]);
        int[] a = Arrays.stream(str2.split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
        scan.close();

        int ret = solver(n, k, a);
        System.out.println(ret);
        return;
    }

    private static int solver(int n, int k, int[] a) {
        if (a.length == 0) {
            return 0;
        }
        if (a.length <= k) {
            return 1;
        }
        int[] newA = Arrays.copyOfRange(a, k - 1, a.length);
        return 1 + solver(n - (k - 1), k, newA);
    }
}
