import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int ans = 100000;
		
		for(int i = 0; i < n; i++){
			ans += ans / 20;
			if(ans % 1000 != 0){
				ans = ans / 1000 * 1000 + 1000;
			}
		}
		System.out.println(ans);
	}
}