import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int left = 1;
        int right = n;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(left).append(" ").append(right).append("\n");
            left++;
            right--;
        }
        System.out.print(sb);
    }
}