import java.util.Scanner;

public class At {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = 0;
		while(true) {
			c-=b;
			if(c<=0) {
				e = 1;
				break;
			}
			a-=d;
			if(a<=0) {
				e = 2;
				break;
			}
		}
		if(e == 1) {
			System.out.println("Yes");
		}else if(e == 2) {
			System.out.println("No");
		}
		
	}
	
}
