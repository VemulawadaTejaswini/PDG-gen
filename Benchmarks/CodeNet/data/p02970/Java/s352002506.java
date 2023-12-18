import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int D = sc.nextInt();
        
        int ans = N / (2*D+1);
        ans += (N % (2*D+1)) == 0 ? 0 : 1;
        
        System.out.println(ans);
    }
}