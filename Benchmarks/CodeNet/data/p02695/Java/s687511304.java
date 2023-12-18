import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] abcdz = new int[Q][4];
        for (int q = 0; q < Q; q++) {
            abcdz[q][0] = sc.nextInt();
            abcdz[q][1] = sc.nextInt();
            abcdz[q][2] = sc.nextInt();
            abcdz[q][3] = sc.nextInt();
        }
        int[] nums = new int[M + N - 1];
        for (int i = 0; i < M + N - 1; i++){
            nums[i] = i+1;
        }
        int max = 0;
        for (int i = 0; i < (1<<(M + N - 1)); i++){
            ArrayList<Integer> SequenceA = new ArrayList<Integer>();
            for (int j = 0; j < (M + N + 1); j++){
                if ((1&i>>j) == 1) {
                    SequenceA.add(nums[j]);
                }
            }
            if (SequenceA.size() != N){continue;}
//            System.out.println(SequenceA);
            int[] ArrayA = new int[N];
            for (int n = 0; n < N; n++){
                ArrayA[n] = SequenceA.get(n) - (n + 1);
//                System.out.println(ArrayA[n]);
            }
            int d = 0;
            for (int q = 0; q < Q; q++){
                if ((ArrayA[abcdz[q][1]-1] - ArrayA[abcdz[q][0]-1]) == abcdz[q][2]){
                    d += abcdz[q][3];
                }
            }
            if (d > max){
                max = d;
            }
        }
        System.out.println(max);
    }
}