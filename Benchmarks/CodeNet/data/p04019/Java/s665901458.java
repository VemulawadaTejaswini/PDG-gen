import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = 0;
		int s = 0;
		int w = 0;
		int e = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='S') {
				s++;
			}
			if(str.charAt(i)=='N') {
				n++;
			}
			if(str.charAt(i)=='E') {
				e++;
			}
			if(str.charAt(i)=='W') {
				w++;
			}
		}
		if(s>0&&n>0&&w==0&&e==0) {
			System.out.println("Yes");
			return;
		}
		if(s==0&&n==0&&w>0&&e>0) {
			System.out.println("Yes");
			return;
		}
		if(s>0&&n>0&&w>0&&e>0) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
		
	}
}