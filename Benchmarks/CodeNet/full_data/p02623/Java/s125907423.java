import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int [] A = new int [N];
        int [] B = new int [M];
        long time = 0;
        int i=0;
        int j=0;
        
        for(int k=0; k<N; k++){
            A[k] = sc.nextInt();
        }
        for(int k=0; k<M; k++){
            B[k] = sc.nextInt();
        }
        
        while(time<K){
            if(i>=N){
                time+=(long)B[j];
                j++;
            }else if(j>=M){
                time+=(long)A[i];
                i++;
            }else if(A[i]>B[j]){
                time+=(long)B[j];
                j++;
            }else{
                time+=(long)A[i];
                i++;
            }
            
            if(i>=N && j>=M){
                break;
            }
        }
        
        if(time == K){
        System.out.println(i+j);
        }else{
            System.out.println(i+j-1);
        }
    }
}
