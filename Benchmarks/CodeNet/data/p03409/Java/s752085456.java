import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ab[][] = new int[N][2];
        for(int i = 0; i <= N-1; i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
            int cd[][] = new int[N][2];
        for(int j = 0; j <= N-1; j++){
            cd[j][0] = sc.nextInt();
            cd[j][1] = sc.nextInt();
        }
        int fp[] = new int[N];
        for(int k = 0; k <= N-1; k++){
            for(int l = 0; l <= N-1; l++){
                if(ab[k][0] < cd[l][0] && ab[k][1] <= cd[l][1]){
                    fp[k] = fp[k] + 1;
                }
            }
        }
        int nb[] = new int[N+1];
        for(int m = 0; m <= N; m++){
            for(int n = 0; n <= N-1; n++){
                if(fp[n] == m){
                    nb[m] = nb[m]+1;
                }
            }
        }
        int Out = 0;
        for(int o = 1; o <= N; o++){
            if((o - Out) < nb[o]){
                Out = Out + 1;
            }else{
                Out = Out + nb[o];
            }
        }
        System.out.println(Out);
    }
}