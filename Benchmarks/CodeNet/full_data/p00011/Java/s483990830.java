import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int[] nums = new int[w];
        for (int i = 0; i < w; i++) {
            nums[i] = i + 1;
        }

        int n = sc.nextInt();
        sc.nextLine();

        int a, b, temp;
        String[] pair;
        for (int i = 0; i < n; i++) {
            pair = sc.nextLine().split(",");
            a = Integer.parseInt(pair[0]) - 1;
            b = Integer.parseInt(pair[1]) - 1;

            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < w; i++) {
            sb.append(nums[i]);
            sb.append('\n');
        }
        System.out.print(sb);
    }
}