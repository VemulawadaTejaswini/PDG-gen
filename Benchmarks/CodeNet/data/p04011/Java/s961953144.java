import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i=0; i<N; i++){
            if(i < K){
                ans += X;
            }else{
                ans += Y;
            }
        }
        
        System.out.println(ans);
    }
}
