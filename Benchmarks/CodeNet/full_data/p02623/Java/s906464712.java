import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int [] A = new int [N];
        int [] B = new int [M];
        int time = 0;
        int i=0;
        int j=0;
        
        for(int k=0; k<N; k++){
            A[k] = sc.nextInt();
        }
        for(int k=0; k<M; k++){
            B[k] = sc.nextInt();
        }
        
        while(time<=K){
            if(i>=N){
                time+=B[j];
                j++;
            }else if(j>=M){
                time+=A[i];
                i++;
            }else if(A[i]>B[j]){
                time+=B[j];
                j++;
            }else{
                time+=A[i];
                i++;
            }
            
            if(i>=N && j>=M){
                break;
            }
        }
        
        if(time>K){
        System.out.println(i+j-1);
        }else{
            System.out.println(i+j);
        }
    }
}