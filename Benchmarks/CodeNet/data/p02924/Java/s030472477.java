import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
 
		long ans = (N-1)*N/2;
 
		System.out.println(ans);
    }
}
