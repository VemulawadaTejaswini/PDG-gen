import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = 1;
        
        for(int i=0; i<N; i++){
        if(X*2>X+K)
         X += K;
         else
         X *= 2;
        }

        System.out.println(X);
    }    
}


