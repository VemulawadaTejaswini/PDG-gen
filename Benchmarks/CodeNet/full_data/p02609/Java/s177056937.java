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
        long varX = 0;

        for (int i = 0; i < parN; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(parX);
            if (String.valueOf(parX.charAt(i)).equals("0")) {
                sb.replace(i, i + 1, "1");
            } else {
                sb.replace(i, i + 1, "0");
            }
            changedX = sb.toString();
            varX = Long.parseLong(changedX, 2);
            System.out.println(func(varX));
        }

    }

    public static long popcount(long x) {
        long result = 0;
        long modN = 0;
        while (x > 0) {
            modN = x % 2;
            x = (x - modN) / 2;
            result = result + modN;
        }
        return result;
    }

    public static long func(long x) {
        long result = 0;
        long popRes = 0;
        while (x > 0) {
            popRes = popcount(x);
            x = x % popRes;
            result++;
        }

        return result;
    }

}