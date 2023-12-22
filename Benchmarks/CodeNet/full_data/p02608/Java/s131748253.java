import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n+1];
		for(int x = 1; x <= 100; x++) {
			for(int y = 1; y <= 100; y++) {
				for(int z = 1; z<= 100; z++) {
					int num =  x*x+y*y+z*z+x*y+y*z+x*z;
					if(num<=n) {
						ans[num]++;
					}
				}
			}
		}
		for(int i =1; i <= n; i++) {
			System.out.println(ans[i]);
		}
	}
}