import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int x[] = new int[N]; 
        int count = 0;

        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            if(x[i]<K-x[i]){
               count += 2*x[i];
            }else{
                count += 2*(K-x[i]);
            }
        }

        System.out.println(count);
        
    }
    
}    



