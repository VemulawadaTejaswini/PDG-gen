import java.util.*;
import static java.lang.System.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int cnt = 1;
        int ans = 0;
        for(int i=1;i<=N;i++){
            ans = 100 * i;
        }
        if (D == 0) {
            ans = N;
        }
        out.print(ans);
        
        
        
        
       
    }
}
