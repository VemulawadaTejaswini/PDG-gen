import java.util.*;

public class Main {
	public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        // 文字列S
        StringBuilder str = new StringBuilder(sc.next());

        // 実施回数
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            // 操作パラメータ取得
            String t = sc.nextLine();

            if ("1".equals(t) && t.length() == 1) {

                // 文字列反転
                str.reverse();
            } else if (t.length() == 5) {

                String[] parm = t.split(" ");

                if ("1".equals(parm[1])) {

                    // 先頭に文字列を追加
                    str.insert(0, parm[2]);
                } else {

                    // 末尾に文字列を追加
                    str.append(parm[2]);
                }
            }
        }

        System.out.println(str);
    }
}