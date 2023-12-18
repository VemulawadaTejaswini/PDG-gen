import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int K = scn.nextInt();
        
        int ans = 1;
        while(true){
            if(Math.pow(K,ans) > N) break;
            ans++;
        }
        System.out.println(ans);
    }
}
