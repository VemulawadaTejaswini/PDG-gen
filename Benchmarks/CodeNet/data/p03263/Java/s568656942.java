
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] nums = new int[h][w];
        int[][] ans = new int[h * w][4];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int size = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w - 1; j++) {
                if (nums[i][j] % 2 == 1) {
                    nums[i][j]--;
                    nums[i][j + 1]++;
                    ans[size][0]=i;
                    ans[size][1]=i+j;
                    ans[size][2]=i;
                    ans[size][3]=j+1;
                    size++;
                }
            }
        }
        for (int i = 0; i < h - 1; i++) {
            if (nums[i][w - 1] % 2 == 1) {
                nums[i][w - 1]--;
                nums[i + 1][w - 1]++;
                int[] tmp = {i, w - 1, i + 1, w - 1};
                ans[size][0]=i;
                ans[size][1]=w-1;
                ans[size][2]=i+1;
                ans[size][3]=w-1;
                size++;
            }
        }

        System.out.println(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((ans[i][j]+1)+" ");
            }
            System.out.println(ans[i][3] + 1);
        }

    }
}
