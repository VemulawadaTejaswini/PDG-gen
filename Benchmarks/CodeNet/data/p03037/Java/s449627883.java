import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		for (int i =1; i<m; i++) {
			int l = scan.nextInt();
			int r = scan.nextInt();
			if(l>a) {
				a=l;
			}
			if(r<b) {
				b=r;
			}
			
		}
		System.out.println(b-a+1);

	}
}