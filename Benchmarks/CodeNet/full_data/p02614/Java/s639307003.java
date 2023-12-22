import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static List<List<Integer>> combr = new ArrayList<>();
    static List<List<Integer>> combc = new ArrayList<>();

    static void solve() {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int k = scan.nextInt();
        boolean[][] arr = new boolean[h][w];
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            String s = scan.next();
            for (int j = 0; j < w; j++) {
                char ch = s.charAt(j);
                if (ch == '#') {
                    cnt++;
                    arr[i][j] = true;
                }
            }
        }
        int ans = 0;
        if (cnt == k) {
            ans++;
        }

        for (int r = 0; r < h; r++) {
            int[] a = new int[h];
            for (int i = 0; i < h; i++) {
                a[i] = i;
            }
            printCombination(a, h, r + 1, false);
        }

        combc.clear();
        for (int r = 0; r < w; r++) {
            int[] a = new int[w];
            for (int i = 0; i < w; i++) {
                a[i] = i;
            }
            printCombination(a, w, r + 1, true);
        }

        int t = 2;

        for (List<Integer> rlist : combr) {
            int lclcnt = 0;
            for (int tt = 0; tt < h; tt++) {
                for (int ttt = 0; ttt < w; ttt++) {
                    if (rlist.contains(tt)) {
                        continue;
                    }
                    if (arr[tt][ttt]) {
                        lclcnt++;
                    }
                }
            }
            if (lclcnt == k) {
                ans++;
            }
        }

        for (List<Integer> clist : combc) {
            int lclcnt = 0;
            for (int tt = 0; tt < h; tt++) {
                for (int ttt = 0; ttt < w; ttt++) {
                    if (clist.contains(ttt)) {
                        continue;
                    }
                    if (arr[tt][ttt]) {
                        lclcnt++;
                    }
                }
            }
            if (lclcnt == k) {
                ans++;
            }
        }

        t = 3;

        for (List<Integer> rlist : combr) {
            for (List<Integer> clist : combc) {
                int lclcnt = 0;
                for (int tt = 0; tt < h; tt++) {
                    for (int ttt = 0; ttt < w; ttt++) {
                        if (rlist.contains(tt) || clist.contains(ttt)) {
                            continue;
                        }
                        if (arr[tt][ttt]) {
                            lclcnt++;
                        }
                    }
                }
                if (lclcnt == k) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        t = 2;


//        long t = scan.nextLong();

//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int res = n%1000;
//            System.out.println(res);
////            scase(n);
//        }
    }


    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r, boolean col) {
        // Current combination is ready to be printed, print it
        if (index == r) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < r; j++) {
                list.add(data[j]);
            }
            if (col) {
                combc.add(list);
            } else {
                combr.add(list);
            }
            //System.out.print(data[j]+" ");
            //System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r, col);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r, boolean col) {
        // A temporary array to store all combination one by one
        int data[] = new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n - 1, 0, r, col);
    }

    static void solveCase(int t, int x, String s) {

    }

    static void scase(long n) {

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