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
            cnt++;
            
            D += sc.nextInt();
            if(D > X)   break;
        }
        
        System.out.println(cnt);
    }
}
