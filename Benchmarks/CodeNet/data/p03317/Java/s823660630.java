import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int n = Integer.parseInt(str1.split(" ")[0]);
        int k = Integer.parseInt(str1.split(" ")[1]);
        int[] a = Arrays.stream(str2.split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray() ;
        scan.close();

        int ret = solver(n, k, a);
        System.out.println(ret);
        return;
    }

    private static int solver(int n, int k, int[] a) {
        boolean hit = false;
        int left = 0;
        int right = 0;
        for (int i = 0; i < a.length; i++) {
            if (hit == false && a[i] == 1) {
                hit = true;
                continue;
            }
            if (hit) {
                right += 1;
            } else {
                left += 1;
            }
        }
        int ret = (left + k - 2) / (k - 1)  + (right + k - 2) / (k - 1);
        return ret;
    }
}
