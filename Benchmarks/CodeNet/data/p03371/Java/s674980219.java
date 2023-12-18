
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt()*2;
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(A+B>=C) {
			if(A!=0&&B!=0) {
				int minxy = min(X,Y);
				int numc = C*minxy;
				int sum = numc + A*(X-minxy) + B*(Y-minxy);
				
				int sum2 = C*max(X,Y);
				
				System.out.println(min(sum,sum2));
			}
			if(A==0||B==0) {
				System.out.println(A*X + B*Y);
			}
		}else {
			System.out.println(A*X + B*Y);
		}
		
	}

	public static int min(int a,int b) {
		return a<b?a:b;
	}
	
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	
}
