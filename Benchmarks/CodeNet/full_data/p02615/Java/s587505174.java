import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        int ans = 0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        
        for(int i=N-1; i>0; i--){
            ans+=A[i];
        }
        
        System.out.println(ans);
    }
}
