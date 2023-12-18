import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[]L = new int[N+1];

        int cou =1;
        int wa = 0;
        for(int i=0; i<N; i++){   
            L[i] = sc.nextInt();
            if(wa+L[i]<=K){
                wa += L[i];
                    cou++;
        } 
    }        
	System.out.println(cou);
      }
}
