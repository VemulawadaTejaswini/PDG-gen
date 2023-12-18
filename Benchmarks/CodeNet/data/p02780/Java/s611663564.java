import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ev[] = new int[N+1];

        ev[0] = 0;
        for(int i=1; i<=N; i++){
            int p = sc.nextInt() + 1;
            ev[i] = ev[i-1] + p;
        }

        int max = 0;
        
        for(int i=0;i<N-K+1;i++){
            if(max < ev[K+i] - ev[i]){
                max = ev[K+i] - ev[i];
            }
        }

        System.out.println(((double)max)/2);

    }
}