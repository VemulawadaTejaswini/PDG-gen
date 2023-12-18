import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int judgePoint = 0;
        int basePoint = 0;
        if (a > b) {
            basePoint = b;
            judgePoint = a;
        } else {
            basePoint = a;
            judgePoint = b;
        }

        int plusW = basePoint + width;

        int ans;
        if (plusW >= judgePoint ) {
            ans = 0;
        } else {
            ans = judgePoint - plusW;
        }

        System.out.println(ans);
    }
}
