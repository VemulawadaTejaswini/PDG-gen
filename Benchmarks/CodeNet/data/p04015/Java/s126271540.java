/**
 * Created on 2016/08/28.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=0; i<N; i++){
            nums.add(sc.nextInt());
        }

        Collections.sort(nums);

        long ret = dfs(nums, 0, 1, 0, A);

        System.out.println(ret);

    }

    private static long dfs(ArrayList<Integer> nums, int idx, int depth, int acc, int A) {

        boolean flag = false;

        // base
        if(nums.get(idx) + acc > A * depth){
            return 0;
        }

        if(nums.get(idx) + acc == A * depth){
            flag = true;
            if(idx == nums.size() - 1){
                return 1;
            }
        }

        if(idx == nums.size() - 1){
            return 0;
        }

        // search

        long ret = 0;
        ret += dfs(nums, idx+1, depth+1, acc + nums.get(idx), A);
        ret += dfs(nums, idx+1, depth, acc, A);
        if(flag){
            ret++;
        }

        return ret;

    }


    // Algorithms
    private static ArrayList<Integer> getPrimeNumbers(int upperLimit) {
        ArrayList<Integer> ret = new ArrayList<Integer>();

        ret.add(2);
        ret.add(3);

        for (int i = 5; i <= upperLimit; i += 2) {
            boolean isPrime = true;
            // 素数で平方根まで試し割りしてみる
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                ret.add(i);
            }
        }
        return ret;
    }

    // View Method
    //* List
    public static <T> void viewList(List<T> list) {
        for (T item : list) {
            System.out.print(item + "\t");
        }
        System.out.println("");
    }

    //* Map
    public static <K, V> void viewMap(Map<K, V> map) {
        Set<K> keys = map.keySet();
        for (K key : keys) {
            System.out.print("(" + key + ", " + map.get(key) + ")\t");
        }
        System.out.println("");
    }

    //* Matrix
    public static void viewIntMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
