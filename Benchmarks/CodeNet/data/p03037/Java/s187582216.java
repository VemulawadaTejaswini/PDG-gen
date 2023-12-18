import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N,M,count;
        int L;
        int R;
        int[] List;

        count = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        List = new int[N];
        
        for(int i = 0; i < M; i++) {
           L = sc.nextInt();
           R = sc.nextInt();
            for(int j = L -1; j < R; j++) {
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