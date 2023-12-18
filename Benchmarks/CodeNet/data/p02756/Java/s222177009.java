import java.util.*;

public class Main {
	public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        // 文字列S
        StringBuilder str = new StringBuilder(sc.nextLine());

        sc.nextLine();

        while (sc.hasNextLine()) {

            // 操作パラメータ取得
            String t = sc.nextLine();

            if (t.length() == 5) {

                String[] parm = t.split(" ");

                if ("1".equals(parm[1])) {

                    // 先頭に文字列を追加
                    str.insert(0, parm[2]);
                } else {

                    // 末尾に文字列を追加
                    str.append(parm[2]);
                }
            } else if (t.length() == 1 && "1".equals(t)) {

                // 文字列反転
                str.reverse();
            }
        }

        System.out.println(str);
    }
}