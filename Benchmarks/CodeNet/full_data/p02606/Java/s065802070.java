import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] ans = new int [N+1];
        int tmp = 0;
        
        for(int i=1; i<N; i++){
            for(int j=1; j<N; j++){
                for(int k=1; k<N ; k++){
                    tmp = i*i+j*j+k*k+i*j+j*k+k*i;
                    if(tmp>N){
                        break;
                    }else{
                        ans[tmp]++;
                    }
                }
            }
        }
        
        for(int i=1; i<=N; i++){
            System.out.println(ans[i]);
        }
        
    }
}