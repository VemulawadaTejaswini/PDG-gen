import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] table = new int[N][2];
        ArrayList<int[]> data = new ArrayList<>();
        data.add(new int[] {0, 0});
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i  = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            table[i][0] = a;
            table[i][1] = b;
        }
        int max = Integer.MIN_VALUE;
        for (int[] arr : table) {
            ArrayList<int[]> temp = new ArrayList<>();
            for (int[] d : data) {
                if ((d[0] | arr[0]) < K) {
                    max = Math.max(max, d[1] + arr[1]);
                    temp.add(new int[] {d[0] | arr[0], d[1] + arr[1]});
                }
            }
            data.addAll(temp);
        }
        System.out.println(max);
    }
}