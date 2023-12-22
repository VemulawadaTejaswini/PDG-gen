import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {


    static void solve() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        boolean[] arr = new boolean[102];
        for(int i=0;i<n;i++) {
            int val = scan.nextInt();
            arr[val] = true;
        }


        int i = x;
        int min = 0;
        while(i>=0) {
            if(!arr[i]) {
                min = i;
                break;
            }
            i--;
        }
        i=x+1;
        while(true) {
            if(!arr[i]) {
                int diff = i-x;
                int minDiff = x-min;
                if(diff < minDiff) {
                    min = i;
                }
                break;
            }
            i++;
        }

        System.out.println(min);

//        int x1 = scan.nextInt();
//        int x2 = scan.nextInt();
//        int x3 = scan.nextInt();
//        int x4 = scan.nextInt();
//        int x5 = scan.nextInt();




//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//
//            scase();
//        }
    }


//    static void solveCase(int t, int x, String s) {
//
//    }

    static void scase() {

    }




    public static void main(String[] args) {
        solve();
        //        Main m = new Main();
        //        Scanner scan = new Scanner(System.in);

        //        long n = scan.nextLong();
        //        long r = scan.nextLong();
        //        List<Long> list = new ArrayList<>();
        ////        int[] arr = new int[n];
        //        for (long i=0;i<n;i++){
        //            list.add(scan.nextLong());
        //        }
//            System.out.println(ch);
        //        solve(n, arr);
        //        scan.close();
    }


//
//    class Counter extends HashMap<Integer, Integer> {
//        public int get(int k) {
//            return containsKey(k) ? super.get(k) : 0;
//        }
//
//        public void add(int k, int v) {
//            put(k, get(k) + v);
//        }
//    }


//    static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }

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