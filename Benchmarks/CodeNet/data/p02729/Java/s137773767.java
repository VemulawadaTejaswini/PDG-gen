import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int gu = 0;
        for(int i=0; i<N; i++){
            gu += i;
        }
        int ki = 0;
        for(int j=0; j<M; j++){
            ki += j;       
        }
        System.out.println(gu+ki);
	}
}
