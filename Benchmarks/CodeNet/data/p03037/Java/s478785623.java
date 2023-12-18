import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N,M,count;
        int[] L;
        int[] R;
        int[] List;

        count = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        L = new int[M];
        R = new int[M];
        List = new int[N];
        
        for(int i = 0;i < M; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++) {
            for(int j = L[i] - 1; j < R[i]; j++) {
                List[j]++;
            }
        }

        for(int i = 0; i < N; i++) {
            if(List[i] == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}