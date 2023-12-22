import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] R = new int[n];
        int[] P = new int[n]; //profit list
        
        for(int i=0;i<n;i++){
            R[i] = Integer.parseInt(br.readLine());
        }
        
        int maxR = 0;
        for(int i = 0; i<n; i++){
            if(maxR<R[i]){ maxR = R[i];
            
                for(int j=i+1; j<n; j++){
                    if( P[i]<(R[j]- R[i]) ){
                        P[i] = R[j]-R[i];
                    }
                }
            }
        }
        
        System.out.println(findmax(P));
    }
    
    static int findmax(int[] x){
        int max=0;
        for(int i = 0;i<x.length;i++){
            if(i == 0){
                max = x[i];
            }else{
                max = Math.max(max, x[i]);
            }
            
        }
        return max;
    }
    
    
}