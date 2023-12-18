import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String S = sc.next();
        long sum = 0;
        long R = 0;
        long G = 0;
        long B = 0;
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == 'R'){
                R++;
            }else if(S.charAt(i) == 'G'){
                G++;
            }else{
                B++;
            }
        }
        sum = R*G*B;
        for(int i = 1; i <= N; i++){
            for(int j = i+1; j <= N; j++){
                int k = 2*j-i;
                if(k <= N){
                    if(S.charAt(i-1) == S.charAt(j-1) || 
                        S.charAt(k-1) == S.charAt(j-1) ||  
                        S.charAt(i-1) == S.charAt(k-1)
                    ){
                        
                    }else{
                        sum--;
                    }
                }
            }
        }
        System.out.println(sum);
    }
} 