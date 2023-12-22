import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        long x = scan.nextLong();
        long k = scan.nextLong();
        long d = scan.nextLong();

        if(Math.abs(d) == Math.abs(x)) {
            if(d%2 == 0) {
                System.out.println(Math.abs(x));
                return;
            }
            System.out.println(0);
            return;
        }

        if(Math.abs(d) > Math.abs(x)) {
            long res1 = x + d;
            long res2 = x - d;
            long res = Math.min(Math.abs(res1), Math.abs(res2));
            System.out.println(res);
            return;
        }
        long st = Math.abs(x)%Math.abs(d);
        if(st > k) {
            st = k;
        }
        List<Long> list = new ArrayList<>();
        long add = st * Math.abs(d);
        long res1 = Math.abs(x) - Math.abs(add);
        list.add(Math.abs(res1));
        if(st<k) {
            long res3 = Math.abs(Math.abs(res1) - Math.abs(d));
            list.add(Math.abs(res3));
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        return;

//        st = k;
//        long add = st * Math.abs(d);
//        long res1 = x + add;
//        long res2 = x - add;
//        long res = Math.min(Math.abs(res1), Math.abs(res2));
//        System.out.println(res);

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