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
        int[] nums = new int[M];

        for (int m = 0; m < M; m++){
            nums[m] = m+1;
        }
        int max = 0;
        for (int i = 0; i < (1<<M); i++){
            ArrayList<Integer> SequenceA = new ArrayList<Integer>();
//            System.out.println(i+" "+M);
            for (int m = 0; m < M; m++){
                if ((1&i>>m) == 1) {
                    SequenceA.add(nums[m]);
                }
            }
//            System.out.println(SequenceA);
            if (SequenceA.size() != N){continue;}
//            System.out.println(SequenceA);
            int d = 0;
            for (int q = 0; q < Q; q++){
//                System.out.println("A"+(abcdz[q][1]-1) +" "+ SequenceA.get(abcdz[q][1]-1)
//                        +" A"+ (abcdz[q][0]-1) +" "+ SequenceA.get(abcdz[q][0]-1) +" "+abcdz[q][2]+" "+d);
                if ((SequenceA.get(abcdz[q][1]-1) - SequenceA.get(abcdz[q][0]-1)) == abcdz[q][2]){
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