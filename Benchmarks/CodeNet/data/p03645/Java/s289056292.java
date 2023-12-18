import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int[] a  = new int[M];
        int[] b  = new int[M];
        for(int i=0;i<M;i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        
        String    ans = "IMPOSSIBLE";
        
       for(int i =0; i < M; i++){
           
            if(a[i] == 1){
                
                 for(int j =0; j < M; j++){
                
                    if( b[i] == a[j] && b[j] == N  ) ans = "POSSIBLE";
                
                } 
            }
           
       }
        
        System.out.println(ans);

        System.out.println();
    }

}