// 配列をそのまま探索するバージョン
// ちょっと早くなるかも？
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] test = {"dreamer", "dream", "eraser", "erase"};
        boolean isAns = true;

        int index = s.length();
        while (index > 0) {
            boolean isCheck = false;
            for (int i = 0; i < 4; i++) {
                boolean flag = true;
                int start = index - test[i].length();
                if (start < 0)
                    continue;
                
                for (int j = 0; j < start; j++) {
                    if (s.charAt(start+j) != test[i].charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    isCheck = true;
                    index = start;
                    break;
                }
            }

            if (!isCheck) {
                isAns = false;
                break;
            }
        }

        System.out.println(isAns ? "YES" : "NO");
    }
}