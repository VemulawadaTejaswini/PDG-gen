import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String... args) throws IOException {
        final int[] targetAry = load();

        insertionSort(targetAry);

        System.out.print(sb.toString());
    }

    public static int[] load() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final String[] strNums = br.readLine().split(" ");
        final int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }

        return nums;
    }

    public static void insertionSort(final int[] targetAry) {
        for (int i = 0; i < targetAry.length; i++) {
            for (int j = i; 0 < j; j--) {
                if (targetAry[j - 1] > targetAry[j]) {
                    swap(targetAry, j - 1, j);
                }
                if ((1 < j) && (targetAry[j - 1] > targetAry[j - 2])) {
                    break;
                }
            }

            print(targetAry);
        }
    }

    public static void swap(final int[] targetAry, final int from, final int to) {
        final int tmp = targetAry[to];
        targetAry[to] = targetAry[from];
        targetAry[from] = tmp;
    }

    public static void print(final int[] ary){
        final StringBuilder sb = new StringBuilder();
        for (int j = 0; j < ary.length; j++) {
            sb.append(ary[j]).append(j != ary.length - 1 ? ' ' : '\n');
        }
        System.out.print(sb.toString());
    }
}