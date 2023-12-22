import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    private static int N;
    private static String[] Ss;
    private static int[] Cs;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        Ss = new String[N];
        Cs = new int[N];
        
        for (int i = 0; i < N; i++) {
            Ss[i] = sc.next();
            Cs[i] = sc.nextInt();
        }
        
        long min = Long.MAX_VALUE;
        
        // 単体で回文になっているものがあるか調べる
        for (int i = 0; i < N; i++) {
            if (isPalindrome(Ss[i]) && Cs[i] < min) {
                min = Cs[i];
            }
        }
        
        // 左端と右端の文字列を選び、その場合の最小コストを調べる
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                long cost = cost(Ss[i], Ss[j]);
                if (cost < min - Cs[i] - Cs[j]) {
                    min = cost + Cs[i] + Cs[j];
                }
            }
        }
        
        System.out.println(min == Long.MAX_VALUE ? -1 : min);
    }
    
    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    private static boolean isSameEdge(String left, String right) {
        int i = 0;
        int j = right.length() - 1;
        while (i < left.length() && 0 <= j) {
            if (left.charAt(i) != right.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    private static final Map<String, Long> leftRemCosts = new HashMap<>();
    private static final Map<String, Long> rightRemCosts = new HashMap<>();
    
    private static long cost(String left, String right) {
        if (!isSameEdge(left, right)) {
            return Long.MAX_VALUE;
        }
        if (left.length() == right.length()) {
            return 0;
        }
        
        long min = Long.MAX_VALUE;
        
        if (left.length() < right.length()) {
            String rightRem = right.substring(0, right.length() - left.length());
            if (rightRemCosts.containsKey(rightRem)) {
                return rightRemCosts.get(rightRem);
            }
            if (isPalindrome(rightRem)) {
                rightRemCosts.put(rightRem, 0L);
                return 0;
            }
            
            for (int i = 0; i < N; i++) {
                long cost = cost(Ss[i], rightRem);
                if (cost < min - Cs[i]) {
                    min = cost + Cs[i];
                }
            }
            rightRemCosts.put(rightRem, min);
            
        } else {
            String leftRem = left.substring(right.length());
            if (leftRemCosts.containsKey(leftRem)) {
                return leftRemCosts.get(leftRem);
            }
            if (isPalindrome(leftRem)) {
                leftRemCosts.put(leftRem, 0L);
                return 0;
            }
            
            for (int i = 0; i < N; i++) {
                long cost = cost(leftRem, Ss[i]);
                if (cost < min - Cs[i]) {
                    min = cost + Cs[i];
                }
            }
            leftRemCosts.put(leftRem, min);
        }
        return min;
    }
}
