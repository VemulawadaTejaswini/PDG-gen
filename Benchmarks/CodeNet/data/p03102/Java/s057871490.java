class Main{
    public static void main(String args[]){
        int count = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int[][] A = new int[N][M];
        int[] B = new int[M];
        for(int i = 0; i < M;i++){
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                A[i][j] = sc.nextInt();
            }
        } 

        for(int i = 0; i < N; i++){
            int sum = C;
            for(int j = 0; j < M;i++){
                sum += A[i][j] * B[j];
            }
            if(sum > 0)count++;
        }
    }
}