import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 入力処理
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        int cnt = 0;
        int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int num : nums) {
            a[cnt] = num;
            cnt++;
        }

        Arrays.sort(a);
        int alice = 0;
        int bob = 0;
        boolean turnAlice = true;
        for (int i = n - 1; i >= 0; i--) {
            if (turnAlice) {
                alice+=a[i];
                turnAlice = false;
            } else {
                bob+=a[i];
                turnAlice = true;
            }
        }

        System.out.println(alice - bob);
    }
}
