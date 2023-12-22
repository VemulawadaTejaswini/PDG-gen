import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int parN = Integer.parseInt(sc.next());
        final String parX = sc.next();
        sc.close();
        String changedX = "";
        int varX = 0;

        for (int i = 0; i < parN; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(parX);
            if (String.valueOf(parX.charAt(i)).equals("0")) {
                sb.replace(i, i + 1, "1");
            } else {
                sb.replace(i, i + 1, "0");
            }
            changedX = sb.toString();
            varX = Integer.parseInt(changedX, 2);
            System.out.println(func(varX));
        }

    }

    public static int popcount(int x) {
        int result = 0;
        int modN = 0;
        while (x > 0) {
            modN = x % 2;
            x = (x - modN) / 2;
            result = result + modN;
        }
        return result;
    }

    public static int func(int x) {
        int result = 0;
        int popRes = 0;
        while (x > 0) {
            popRes = popcount(x);
            x = x % popRes;
            result++;
        }

        return result;
    }

}