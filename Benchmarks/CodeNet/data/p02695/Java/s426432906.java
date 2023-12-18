import java.util.*;

public class Main {
    public static List<int[]> list = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        List<int[]> arList = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int[] ar = new int[4];
            for (int j = 0; j < ar.length; j++) {
                ar[j] = sc.nextInt();
            }
            arList.add(ar);
        }
        createP(N, M, 0, new int[N], 1);
        long ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int[] A  = list.get(i);
            long count = 0;
            for (int[] ar : arList) {
                int ai = ar[0];
                int bi = ar[1];
                if ((A[bi-1] - A[ai-1]) == ar[2]) {
                    count += ar[3];
                }
            }
            if (ans < count) {
                ans = count;
            }
        }
        System.out.println(ans);
    }
    
    private static void createP(int N, int M,int index, int[] ptn ,int min) {
        int[] clone = ptn.clone();
        if (N == index) {
            list.add(clone);
            return;
        } else {
            for (int i = min; i <= M; i++) {
                clone[index] = i;
                createP(N, M, index+1, clone, i);
            }
        }
    }
}