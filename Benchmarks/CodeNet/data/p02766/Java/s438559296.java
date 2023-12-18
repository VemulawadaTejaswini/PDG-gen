import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int num = 0;
        
        for(int i=0; i<=N; i++){
            
            if(N < Math.pow(K,i)){
                    System.out.println(i);    
                    break;
                }
                
        }
        
    }
}
