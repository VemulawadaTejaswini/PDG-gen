import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] trees = new int[n];
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
        }
        Arrays.sort(trees);

        int min = Integer.MAX_VALUE;
        for (int i = k - 1; i < n; i++) {
            int left = trees[i - k + 1];
            int right = trees[k];
            int diff = right - left;
            min = Math.min(min, diff);
        }
        System.out.println(min);
    }
}
