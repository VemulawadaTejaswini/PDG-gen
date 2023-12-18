

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] arr = sc.next().toCharArray();
        int[] ans = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {
                ans[i + 1] = ans[i] + 1;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '>') {
                ans[i] = Math.max(ans[i + 1] + 1, ans[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            sum += ans[i];
        }
        System.out.println(sum);
    }
}
