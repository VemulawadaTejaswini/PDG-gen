import java.util.*;
public class Main {
    static int count = 0;
    static int[] nums = {3, 5, 7};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        helper(n, "3", 1, 0, 0);
        helper(n, "5", 0, 1, 0);
        helper(n, "7", 0, 0, 1);
        System.out.println(count);
    }
    private static void helper(int n, String strNum, int three, int five, int seven) {
        long num = Long.parseLong(strNum);
        if(num > n) return;
        if(three >= 1 && five >= 1 && seven >= 1) count++;
        helper(n, strNum + "3", three + 1, five, seven);
        helper(n, strNum + "5", three, five + 1, seven);
        helper(n, strNum + "7", three, five, seven + 1);
    }
}
