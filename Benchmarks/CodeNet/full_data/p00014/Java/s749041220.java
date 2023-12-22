import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int d;
		int ans ;
		int x;
		
		while(scan.hasNextInt()){
			d = scan.nextInt();
			ans = 0;
			x = 1;
			for(int i = d;i < 600; i+=d){
				ans += x * d * x * d * d;
				x++;
			}
			System.out.println(ans);
		}
	}
}