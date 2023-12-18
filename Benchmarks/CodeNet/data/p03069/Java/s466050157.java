import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int ans = 0;
        if (num > 0) {
            String str = sc.next();
            String whiteValue = ".";
            String blackValue = "#";
            int whiteCount = 0;
            int blackCount = 0;
            int tmpWhiteCount = 0;
            int tmpBlackCount = 0;

            String tmpValue = "";
            for (int i = 0; i < num; i++) {
                tmpValue = String.valueOf(str.charAt(i));
                if (tmpValue.equals(whiteValue)) {
                	tmpWhiteCount++;
                }else {
                	break;
                }
            }

            for (int i = num - 1; 0 < i; i--) {
                tmpValue = String.valueOf(str.charAt(i));
                if (tmpValue.equals(blackValue)) {
                	tmpBlackCount++;
                }else {
                	break;
                }
            }

            for (int i = tmpWhiteCount; i < num - tmpBlackCount; i++) {
                tmpValue = String.valueOf(str.charAt(i));
                if (tmpValue.equals(whiteValue)) {
                	whiteCount++;
                }else {
                	blackCount++;
                }
            }

            if (whiteCount >= blackCount) {
                ans = blackCount;
            } else if (whiteCount <= blackCount) {
                ans = whiteCount;
            } else {
                ans = 0;
            }

            System.out.println(ans);
        }
    }
}