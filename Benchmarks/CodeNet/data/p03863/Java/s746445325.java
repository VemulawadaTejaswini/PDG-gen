
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static int getValidPosition(String st, int start) {
        for (int i = start; i < st.length() - 1; i++) {
            if (st.charAt(i - 1) != st.charAt(i + 1)) return i;
        }
        return -1;
    }

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();

        // 長さが偶数のとき、最後は先行
        // 長さが奇数のとき、最後は後攻

        if (st.length() % 2 == 1) {
            if (getValidPosition(st, 0) > -1) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        } else {
            boolean isFirst = false;
            for (int i = 1; i < st.length() - 1; i++) {
                if (st.charAt(i - 1) != st.charAt(i + 1)) {
                    if (getValidPosition(st.substring(0, i) + st.substring(i + 1, st.length()), i - 1) == -1) {
                        isFirst = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (isFirst) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}