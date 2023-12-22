import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


public class Main {


    static void solve() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        t = t.substring(0, t.length()-1);
//        StringBuilder sb = new StringBuilder(s);
//        sb.append(t.charAt(t.length()-1));


        if(s.equals(t)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int k = scan.nextInt();
//            scase(n,k);
////            System.out.println(res);
////            solveCase(i, x,y,s);
//        }
    }



//    static class Pair {
//        int a;
//        int b;
//    }




//    static void solveCase(int t, int x, String s) {
//
//    }



    static void scase(int n, int k) {

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


//    static class Node {
//        int val;
//        Node next;
//        Node random;
//
//        public Node(int val) {
//            this.val = val;
//            this.next = null;
//            this.random = null;
//        }
//    }

//    static class Node {
//        int key;
//        int data;
//        Node next;
//        Node prev;
//
//        Node(int key, int data) {
//            this.key = key;
//            this.data = data;
//        }
//    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
