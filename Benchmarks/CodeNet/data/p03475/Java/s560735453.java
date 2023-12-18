import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] C = new int[N];
        int[] S = new int[N];
        int[] F = new int[N];

        for(int i=0; i<N-1; i++){
            C[i] = sc.nextInt();
            S[i] = sc.nextInt();
            F[i] = sc.nextInt();
        }
        
        for(int i=0; i<N-1; i++){
            int t = 0;
            for(int j=i; j<N-1; j++){
                if(S[j]>=t){
                    t = S[j] + C[j];
                }
                else if(S[j]<t && t%F[j]==0){
                    t += C[j];
                }
                else{
                    t += F[j] - t % F[j] + C[j];
                }
            }
            System.out.println(t);
        }
        System.out.println(0);
    }
}