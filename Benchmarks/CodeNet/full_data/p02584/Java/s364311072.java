import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        long x = Math.abs(scan.nextLong());
        long k = scan.nextLong();
        long d = scan.nextLong();

        long st = x/d;
        if(st > k) {
            long res = Math.abs(x - k*d);
            System.out.println(res);
            return;
        }
        k = k - st;
        x = x - (st*d);
        if(k%2==0) {
            System.out.println(x);
            return;
        }
        long res = Math.abs(x-Math.abs(d));
        System.out.println(res);


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