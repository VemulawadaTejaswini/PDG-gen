import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int D = 0;
        int cnt = 0;
        for(int i=0; i<N; i++){
            if(D > X)   break;
            cnt++;
            
            D += sc.nextInt();
        }
        
        System.out.println(cnt);
    }
}
