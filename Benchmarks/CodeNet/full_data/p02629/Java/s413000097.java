import java.util.Scanner;
/**
 * 解题方法 26 进制
 * k 进制每一位最大只有 k - 1，但是此道题目最大可以是 26，所以每次处理 N - 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        String ans = "";
        while (N > 0) {
            N--;
            ans = (char)(N % 26 + 97) + ans;
            N /= 26;
        }
        System.out.println(ans);
    }
}