import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        if(s.length() == 0) {
            System.out.println(0);
            return;
        }
        int max = 0;
        int cnt = 0;
        if(s.charAt(0) == 'R') {
            max = 1;
            cnt= 1;
        }
        for(int i = 1;i<s.length();i++) {
            if(s.charAt(i) == 'R' && s.charAt(i) == s.charAt(i-1)){
                cnt++;
            } else{
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }
        max = Math.max(max, cnt);
        System.out.println(max);

//        int t = scan.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int[] arr1 = new int[n];
//            for (int j = 0; j < n; j++) {
//                arr1[j] = scan.nextInt();
//            }
////            scase(n, arr1);
//        }


//        long t = scan.nextLong();

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
////            scase(n);
//        }
    }


    static void solveCase(int t, int x, String s) {

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