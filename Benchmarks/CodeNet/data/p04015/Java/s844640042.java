/**
 * Created on 2016/08/31.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();

        int[] nums = new int[N];
        long X = -1;
        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
            X = Math.max(nums[i], X);
        }

        long ans = solve(N, A, nums, (int)X);

        System.out.println(ans);
    }

    private static long solve(int N, int A, int[] nums, int X) {

        long[][][] dp = new long[N+1][N+1][N*X + 1];

        dp[0][0][0] = 1L;

        for(int i=1; i<N+1; i++){
            for(int j=0; j<N+1; j++){
                for(int k=0; k<N*X+1; k++){

                    int prevJ = j-1;
                    int prevK = k-nums[i-1];


                    if(prevJ < 0 || prevK < 0){
                        dp[i][j][k] = dp[i-1][j][k];
                    }else{
                        dp[i][j][k] = dp[i-1][prevJ][prevK] + dp[i-1][j][k];
                    }
                }
            }
        }

        long ret = 0;
        for(int t=1; t<=N; t++){
            ret += dp[N][t][t*(int)A];
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
