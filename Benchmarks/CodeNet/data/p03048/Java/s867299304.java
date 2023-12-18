import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
      	int maxR = 0;
      	int maxG = 0;
      	int maxB = 0;
      
        if(N > 0){
            if(R > 0){
            	maxR = N / R;
            }
            
            if(G > 0){
            	maxG = N / G;
            }
            
            if(B > 0){
            	maxB = N / B;
              
            }
        }    
        
        for(int r = 0;r <= maxR; r++){
          	if(r*R == N){
                count++;
              	continue;
             }else if(r*R > N){
              	continue;
             }
            for(int g = 0;g <= maxG; g++){
              	if(r*R + g*G == N){
                  count++;
                  continue;
             	}else if(r*R + g*G > N){
              	  continue;
             	}
                for(int b = 0;b <= maxB; b++){
                    if(r*R + g*G + b*B == N){
                      count++;  
                    }
                }
            }    
        }
        
        System.out.println(count);
    }
}