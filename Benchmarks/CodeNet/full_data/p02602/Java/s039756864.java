import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
//        long prevRes = 1;
//        for(int i=0;i<k;i++) {
//            prevRes*=arr[i];
//        }
        int cutoffInd = 0;
        for(int i = k;i<n;i++) {
            if(arr[i] > arr[cutoffInd]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            cutoffInd++;
//            long curr = prevRes/arr[cutoffInd]*arr[i];
//            if(curr > prevRes) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//            prevRes = curr;
//            cutoffInd++;
        }


//        for (int i = 0; i < n; i++) {
//
//        }

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