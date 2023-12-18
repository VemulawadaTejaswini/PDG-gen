import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // マス取得
        int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int h = nums[0];
        int w = nums[1];
        int n = nums[2];

        // スタート位置取得
        int[] poss = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int posH = poss[0];
        int posW = poss[1];

        // 方向取得
        String[] dirs = new String[2];
        for (int i = 0; i < 2; i++) {
            dirs[i] = sc.nextLine();
        }

        if (isOut(n, w, w - posW, dirs[0], dirs[1], "L", "R")) {
            System.out.println("NO");
            return;
        }

        if (isOut(n, w, posW, dirs[0], dirs[1], "R", "L")) {
            System.out.println("NO");
            return;
        }

        if (isOut(n, h, h - posH, dirs[0], dirs[1], "U", "D")) {
            System.out.println("NO");
            return;
        }

        if (isOut(n, h, posH, dirs[0], dirs[1], "D", "U")) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }

    private static boolean isOut(int n, int maxHW, int startPos, String tDir, String aDir, String t, String a) {
        String[] tDirs = tDir.split("");
        String[] aDirs = aDir.split("");
        for (int i = 0; i < n; i++) {
            // 高橋くんのターン
            if (tDirs[i].equals(t)) {
                if (++startPos >= maxHW) {
                    return true;
                }
            }

            // 青木くんのターン
            if (aDirs[i].equals(a)) {
                if (startPos - 1 > 0) {
                    startPos--;
                }
            }
        }
        return false;
    }

    private static int getCount(String str, char target){
        int count = 0;

        for(char x: str.toCharArray()){
            if(x == target){
                count++;
            }
        }

        return count;
    }
}