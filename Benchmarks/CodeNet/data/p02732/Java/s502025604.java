import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> mMap = new HashMap<Integer, Integer>(N);
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (mMap.containsKey(A[i])) {
                mMap.put(A[i], mMap.get(A[i])+1);
            }
            else {
                mMap.put(A[i], 1);
            }
        }
        sc.close();

        int allsum = 0;
        for (int i : mMap.keySet()) {
            int num = mMap.get(i);
            allsum += (num * (num - 1)) / 2;
        }
        for (int i = 0; i < N; i ++) {
            int num = mMap.get(A[i]);
            System.out.println(allsum - (num -1));
        }
    }
}
