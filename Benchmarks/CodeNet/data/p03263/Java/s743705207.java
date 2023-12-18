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
                    int[] tmp = {i, j, i, j + 1};
                    for (int k = 0; k < 4; k++) {
                        ans[size] = tmp;
                    }
                    size++;
                }
            }
        }
        for (int i = 0; i < h - 1; i++) {
            if (nums[i][w - 1] % 2 == 1) {
                nums[i][w - 1]--;
                nums[i + 1][w - 1]++;
                int[] tmp = {i, w - 1, i + 1, w - 1};
                for (int k = 0; k < 4; k++) {
                    ans[size] = tmp;
                }
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
