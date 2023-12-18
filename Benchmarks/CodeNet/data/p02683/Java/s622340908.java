import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        int n = scan.nextInt();
        int m = scan.nextInt();
        int x = scan.nextInt();

        int[] c = new int[n];
        int[][] a = new int[n][m];

        for(int i=0;i<n;i++) {
            c[i] = scan.nextInt();
            int[] gain = new int[m];
            for(int t=0;t<m;t++) {
                a[i][t] = scan.nextInt();
            }
        }

        int mincost = Integer.MAX_VALUE;
        for(int i=0;i<m;i++) {
            int[] initalg = new int[m];
            int initCost = c[i];
            for (int j=0;j<m;j++) {
                initalg[j]+=a[i][j];
            }
            boolean isOk = enough(initalg, x);
            if(isOk) {
                mincost = Math.min(mincost, initCost);
            }
            int u = 1;
            while(i+u<n) {
                int cost = initCost;
                int[] alg = new int[m];
                for (int j=0;j<m;j++) {
                    alg[j]=initalg[j];
                }
                for(int j=i+u; j<n;j++) {
                    cost+=c[j];
                    for (int t=0;t<m;t++) {
                        alg[t]+=a[j][t];
                    }
                    isOk = enough(alg, x);
                    if(isOk) {
                        mincost = Math.min(mincost, cost);
                    }
                }
                u++;
            }
        }
        if(mincost != Integer.MAX_VALUE) {
            System.out.println(mincost);
            return;
        }
        System.out.println(-1);

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int k = scan.nextInt();
//            scase(n,k);
////            System.out.println(res);
////            solveCase(i, x,y,s);
//        }
    }

    static boolean enough(int[] alg, int x) {
        for (int i=0;i<alg.length;i++) {
            if(alg[i] < x) {
                return false;
            }
        }
        return true;
    }


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
