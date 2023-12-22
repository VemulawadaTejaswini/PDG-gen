import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] C = new int[N];
        int[][] A = new int[N][M];
        int[] sum = new int[N];
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            C[i] = sc.nextInt();
            ans += C[i];
            if(!list.contains(C[i])){
                list.add(C[i]);
            }
            for(int j=0; j<M; j++){
                A[i][j] = sc.nextInt();
                sum[j] += A[i][j];
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<M; i++){
            if(sum[i]<X){
                System.out.println(-1);
                return;
            }
        }
        for(int i=0; i<list.size(); i++){
            int x = list.get(i);
            for(int j=0; j<N; j++){
                if(C[j]==x){
                    for(int k=0; k<M; k++){
                        if(sum[k]-A[j][k]<X){
                            break;
                        }
                        if(k==M-1){
                            for(int l=0; l<M; l++){
                                sum[l] -= A[j][l];
                            }
                            ans -= C[j];
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}