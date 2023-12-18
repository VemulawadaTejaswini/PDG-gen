import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for (int i=1;i<=N;i++) {
		    if (i %2 != 0) {
		        count+=1;
		    }
		}
		
		double ans = (double) count/N;
		System.out.println(ans);
    
    }
}