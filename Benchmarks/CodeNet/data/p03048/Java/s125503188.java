import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		
		int shutsuryoku = 0;
		
		for(int i=0;i<n/r+1;i++) {
			shutsuryoku += howmany(n-r*i, g, b);
		}
		System.out.print(shutsuryoku);
	}
	
	public static int howmany(int max, int a, int b) {
		int kaeru = 0;
		for(int i=0;i<max/a+1;i++) {
			if((max-a*i)%b==0) {
				kaeru++;
			}
		}
		return kaeru;
	}

}