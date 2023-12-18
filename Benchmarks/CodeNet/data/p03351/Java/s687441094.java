import java.util.Scanner;

class probremA {
	public static void main(String args[]){
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		if ((b - a <= d && c - b <= d) || c - a <= d){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
		
		return;
	}
}