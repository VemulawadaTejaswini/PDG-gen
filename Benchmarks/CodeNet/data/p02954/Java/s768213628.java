import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String original = sc.next();
        int firstIndex = original.indexOf("RL");
        int nowIndex = 0;

        StringBuilder builder = new StringBuilder();

        while (firstIndex >= 0) {

            // 左辺の計算
            String left = original.substring(nowIndex, firstIndex);

            builder.append("0 ".repeat(left.length()));

            int rCount = 1;
            int lCount = 1;
            rCount += left.length() / 2;
            lCount += Math.ceil((double) left.length() / 2);

            // 右辺の計算
            int nextIndex = firstIndex + 2 > original.length() ? - 1 : original.substring(firstIndex + 2).indexOf("RL");
            String right = "";
            // 右辺が存在する
            if (firstIndex + 3 <= original.length() && original.substring(firstIndex + 2, firstIndex + 3).equals("L")) {
                // まだRLがある
                if (nextIndex >= 0) {
                    nextIndex += firstIndex + 2;
                    right = original.substring(firstIndex + 2, nextIndex);
                    right = right.replace("R", "");
                    nowIndex = firstIndex + 2 + right.length();
                } else {
                    // もうない
                    right = original.substring(firstIndex + 2);
                    right = right.replace("R", "");
                    nowIndex = firstIndex + 2;
                }
                lCount += right.length() / 2;
                rCount += Math.ceil((double) right.length() / 2);
            } else {
                nowIndex = firstIndex + 2;
                if (nextIndex >= 0) {
                    nextIndex += firstIndex + 2;
                }
            }

            builder.append(rCount).append(" ").append(lCount).append(" ");
            builder.append("0 ".repeat(right.length()));
            firstIndex = nextIndex;
        }
        System.out.println(builder);
    }
}