import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    static int res(String ss, String t) {
        int cnt = 0;
        for(int i=0;i<ss.length();i++) {
            if(ss.charAt(i) != t.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }


    static void solve() {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();
        int min = t.length();
        for(int i = 0; i + t.length() <= s.length(); i++) {
            String ss = s.substring(i, i+t.length());
            int cnt = res(ss, t);
            min = Math.min(cnt, min);
        }
        System.out.println(min);

//        int t = scan.nextInt();
//        for (int i = 0; i < t; i++) {
////            solveCase();
//        }


//        long t = scan.nextLong();

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
////            scase(n);
//        }
    }


    static void solveCase(int zero1, int one1, int two1, int zero2, int one2, int two2) {

    }

    static void scase(int[] arr1, int[] arr2) {
    }


    public static void main(String[] args) {

        solve();
    }


    static class LoggerNode {
        String message;
        int ts;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}