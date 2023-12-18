import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[][] gcms = new int[n][n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        gcms[0] = nums;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                gcms[i][j]=gcm(gcms[i-1][j],gcms[i-1][j+1]);

            }
        }
        System.out.println(gcms[nums.length-1][0]);
    }

    static int gcm(int n, int m) {
        int big = n;
        int small = m;
        int tmp;
        while (true) {
            if (big < small) {
                tmp=big;
                big=small;
                small=tmp;
            }
            big=big%small;
            if(big==0){
                return small;
            }else if(small%big==0){
                return big;
            }

        }

    }
}