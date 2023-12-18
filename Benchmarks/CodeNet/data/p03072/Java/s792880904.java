import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().split("")[0]);
        String[] nums = sc.nextLine().split(" ");

        int max = 0;
        int cnt = 0;
        for (String num : nums) {
            int h = Integer.parseInt(num);
            if (max <= h) {
                cnt++;
                max = h;
            }
        }
        System.out.println(cnt);
    }
}
