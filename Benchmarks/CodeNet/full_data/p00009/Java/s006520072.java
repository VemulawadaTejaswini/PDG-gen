import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			int n = scan.nextInt();
			int cnt = 0, j;
			
			for(int i = 2; i <= n; i++) {
				for(j=i/2; i%j!=0; j--);
				if(j==1) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}
}