import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int length = arr.length;
        int[] counts = new int[length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            if (arr[i] == 'R') {
                stack.push(i);
            } else {
                while (stack.size() > 0) {
                    counts[i - (i + stack.pop()) % 2]++;
                }
            }
        }
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] == 'L') {
                stack.push(i);
            } else {
                while(stack.size() > 0) {
                    counts[i + (i + stack.pop()) % 2]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(counts[i]);
        }
        System.out.println(sb);
        
    }
}