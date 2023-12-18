import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		long sum = 0;
		for(int i = 1; i < k+1; i++) {
			for (int m = 1; m < k+1; m++) {
				for(int l = 1; l <k+1; l++) {
					sum +=yu(yu(i,m),l);
				}
			}
		}
		System.out.println(sum);
		
	}
	static int yu(int a, int b) {
		int c;
		while(true) {
			if(b==0) {
				a =0;
				break;
			}
			c = a%b;
			a = b;
			b = c;
			if(c == 0) {
				break;
			}
			
		
		}
		return a;
	}
	
}
