import java.util.Scanner;

public class Main {
	  public static void main(String[] args ) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int F = Math.abs(A-B);
		
		int ans = -1;
		
		for(int i = 0;i < F;i++) {
			if(Math.abs(A-i) == Math.abs(B-i)){
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