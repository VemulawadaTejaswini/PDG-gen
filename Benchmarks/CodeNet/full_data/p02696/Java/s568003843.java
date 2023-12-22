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
        long a = scan.nextLong();
        long b = scan.nextLong();
        long n = scan.nextLong();


        long ans = b-1;
        if(ans > n) {
            ans = n;
        }
        long res = a * ans/b - a*(ans/b);
//        int[] seq = new int[n];
//        int[][] diff = new int[n][n];
//        int[][] score = new int[n][n];
//        for (int i=0;i<n;i++) {
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            int c = scan.nextInt();
//            int d = scan.nextInt();
//
//            //check score for [i,j], if curr_score>score, change c
//           if(d > score[a][b]) {
//               diff[a][b] = c;
//               score[a][b] = d;
//           }
//        }
//        seq[0] = 1;


//            for (int j=i+1;j<n;j++) {
//
//            }
//        }

        System.out.println(res);
//        for (int i = 0; i < t; i++) {
//            int x = scan.nextInt();
////            int res = scase(n);
////            System.out.println(res);
////            solveCase(i, x,y,s);
//        }
    }



//    static class Pair {
//        int a;
//        int b;
//    }


    static void solveCase(int t, int x, String s) {

    }


//    static int scase(int n) {
//
//    }

    public static void main(String[] args) {

//
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
