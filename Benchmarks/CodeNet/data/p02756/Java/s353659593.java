import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.next());
        int q = Integer.parseInt(sc.next());

        boolean isReverse = false;
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if ("2".equals(query)) {
                String func = sc.next();
                if (("1".equals(func) && !isReverse) || ("2".equals(func) && isReverse)) {
                    sb.insert(0, sc.next());
                } else {
                    sb.append(sc.next());
                }
            } else {
                isReverse = !isReverse;
            }
        }

        if (isReverse) {
            sb.reverse();
        }

        // 出力
        System.out.println(sb.toString());
        sc.close();
    }
}