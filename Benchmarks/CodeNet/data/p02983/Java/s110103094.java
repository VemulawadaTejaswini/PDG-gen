import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left = Integer.parseInt(in.next());
        int right = Integer.parseInt(in.next());
        in.close();
        int leftdiv = left / 2019;
        int rightdiv = right / 2019;
        int leftMod = left % 2019;
        int rightMod = right % 2019;
        int ans = -1;
        if (leftdiv == rightdiv) {
            lp:
            for (int i = leftMod; i < rightMod; i++) {
                for (int j = i + 1; j <= rightMod; j++) {
                    if (i * j % 2019 < ans || ans == -1) {
                        ans = i * j % 2019;
                    }
                    if (ans == 0) break lp;
                }
            }
        } else {
            ans = 0;
        }
        System.out.println(ans);
    }
}
