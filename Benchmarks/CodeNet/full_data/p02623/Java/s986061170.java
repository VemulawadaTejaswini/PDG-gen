import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for(int i=0;i<N;i++){
            A[i] = scanner.nextInt();
        }

        for(int i=0;i<M;i++){
            B[i] = scanner.nextInt();
        }
        int ans = 0;
        if(N<=M){
            ans = solve(N,M,K,A,B);
        }
        else{
            ans = solve(M,N, K,A,B);
        }



        System.out.println(ans);
        scanner.close();
    }

    static int solve(int N,int M,int K,int[] A,int[] B){
        int ans = 0;
        int time = 0;
        int temp = 0;
        int[] timecnt = new int[M];


                for(int i=0;i<M;i++){
                    timecnt[i] = 0;
                }

                time =0;
                for(int j=0;j<N;j++){
                    for(int i=0;i<N-j;i++){
                        if(time + A[i] > K){
                            break;
                        }
                        else{
                            time += A[i];
                            timecnt[j] +=1;
                        }
                    }
                    for(int i=0; i<M;i++){
                        if(time + B[i] > K){
                            break;
                        }
                        else{
                            time += B[i];
                            timecnt[j] +=1;
                        }
                    }
                }

                /*
                for(int i=0;i<M;i++){
                    System.out.println(timecnt[i]);
                }
                */

                ans = timecnt[0];
                //System.out.println(ans);
                for(int i=0;i<M;i++){
                    if(timecnt[i] != 0){
                        if(temp > timecnt[i]){
                            ans = timecnt[i];
                        }
                        temp = timecnt[i];
                    }
                }

        return ans;
    }
}