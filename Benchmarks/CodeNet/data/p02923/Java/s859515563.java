import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int pre = heights[0];
        int tmpCount = 0;
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (heights[i] <= pre) {
                tmpCount++;
            } else {
                if (tmpCount >= result) {
                    result = tmpCount;
                    tmpCount = 0;
                }
            }
            pre = heights[i];
        }

        if (tmpCount > result) {
            System.out.println(tmpCount);
        } else {
            System.out.println(result);
        }

    }
}
