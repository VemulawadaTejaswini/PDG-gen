import java.util.Scanner;

public class main {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int F = Math.abs(A-B);
		
		int ans = -1;
		
		for(int i = 0;i < F;i++) {
			if((A-i) == (B-i)){
				ans = i;
			}
		}
		if(ans == -1) {
			System.out.println("IMPOSSHIBLE");
		}else {
			System.out.println(ans);
		}
	}
}