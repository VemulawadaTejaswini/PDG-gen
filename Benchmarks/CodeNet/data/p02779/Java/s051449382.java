import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] A = new int[N];
        int hantei = 0;
        
        for(int i=0; i<N; i++){
            
            int x = scanner.nextInt();
            A[i] = x;
            
        }
        
        for(int i=0; i<N; i++){
            
            for(int j=i+1; j<N; j++){
                if(A[i]==A[j]){
                    hantei = 1;
                    break;
                }
            }
        }
        
        if(hantei == 1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
    }
}