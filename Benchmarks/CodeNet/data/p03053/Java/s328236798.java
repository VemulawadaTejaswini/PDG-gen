import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int H = 0;
    private static int W = 0;
    private static char[][] AHW;
    private static int[] RANGE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] HW = sc.nextLine().split(" ");
        H = Integer.parseInt(HW[0]);
        W = Integer.parseInt(HW[1]);

        AHW = new char[H][W];
        for (int i = 0; i < H; i++) {
            String A = sc.nextLine();
            AHW[i] = A.toCharArray();
        }

        make(AHW);
        int times = 0;
        while (true) {
            if (isEnd()) {
                break;
            }
            List<Integer> finds = find();
            times += fill(finds);
        }
        System.out.println(times);
    }

    private static List<Integer> find() {
        List<Integer> finds = new ArrayList<>();
        int size = RANGE.length;
        for (int i = 0; i < size; i++) {
            if (RANGE[i] == 1) {
                finds.add(i);
            }
        }
        return finds;
    }

    private static int fill(List<Integer> finds) {
        boolean isAdd = false;
        int size = finds.size();
        for (int i = 0; i < size; i++) {
            int tar = finds.get(i);

            try {
                if (!((tar - W) / 10 == 1)) {
                    RANGE[tar - 1] = 1;
                    isAdd = true;
                }
            } catch (Exception e) {

            }
            try {
                if (!(tar % W == 0)) {
                    RANGE[tar + 1] = 1;
                    isAdd = true;
                }
            } catch (Exception e) {

            }
            try {
                RANGE[tar - W] = 1;
                isAdd = true;
            } catch (Exception e) {

            }
            try {
                RANGE[tar + W] = 1;
                isAdd = true;
            } catch (Exception e) {

            }
        }

        if (isAdd) {
            return 1;
        } else {
            return 0;
        }

    }

    private static boolean isEnd() {
        return !Arrays.stream(RANGE).anyMatch(s -> s == 0);
    }

    private static void make(char[][] aHW) {
        RANGE = new int[H * W];
        int loop = 0;
        for (char[] cs : aHW) {
            for (char c : cs) {

                if (c == '#') {
                    RANGE[loop] = 1;
                }
                loop++;
            }
        }
    }
}
