import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		while(d>0) {
	
			if(b>a*2*d||c>b) {
				System.out.println("Yes");
				return;
			}
			if(b*2*d>a||c>b*2*d) {
				System.out.println("Yes");
				return;
			}
			if(b>a||c*2*d>b) {
				System.out.println("Yes");
				return;
			}
			d--;
		}
		
		System.out.println("No");

		

	}

}

