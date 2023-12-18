import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();
        int reArr[][] = new int[N][N];
        for(int i=0; i<N; i++){
            reArr[i][i] = -1;
        }
        for(int index=0; index<M; index++){
            int i = in.nextInt();
            int j = in.nextInt();
            reArr[j][i] = -1;
            reArr[i][j] = -1;
        }
        for(int index=0; index<K; index++){
            int i = in.nextInt();
            int j = in.nextInt();
            reArr[j][i] = -1;
            reArr[i][j] = -1;
        }
        for(int j=0; j<N; j++){
            int sum = N;
            for(int i=0; i<N; i++){
                if(reArr[j][i] == -1) sum--;
            }
            System.out.printf("%d ",sum);
        }

        
    }
}