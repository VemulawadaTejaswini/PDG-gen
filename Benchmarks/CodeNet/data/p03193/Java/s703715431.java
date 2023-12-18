import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long H = sc.nextLong();
        long W = sc.nextLong();
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
        	long h = sc.nextLong();
        	long w = sc.nextLong();
        	if (h >= H && w >= W) {
        		ans++;
        	}
        }
        
        System.out.println(ans);
    }
}	