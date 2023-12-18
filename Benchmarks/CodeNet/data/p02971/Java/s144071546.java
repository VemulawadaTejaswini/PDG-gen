import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] array = new int[N+1];
        
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        
        
        int[] max = new int[N+1];
        
        int tmp;
        
        for(int i = 0; i < N; i++){
            
            tmp = 0;
            
            for(int j = 0; j < N; j++){
                
                if(i == j){
                    continue;
                }
                if(tmp < array[j]){
                    tmp = array[j];
                }
            }
            System.out.println(tmp);
        }
        
    }
}
