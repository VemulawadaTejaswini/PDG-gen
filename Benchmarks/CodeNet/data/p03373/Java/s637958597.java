import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int smallerNum = X <= Y ? X : Y;
		int largerNum = X >= Y ? X : Y;
		boolean isCCheap= ((A + B) > 2 * C) ? true : false; 
		
		int aNum = 0;
		int bNum = 0;
		int cNum = 0;
		
		if (isCCheap) {
			if (A > 2 * C && B > 2 * C) {
				cNum = largerNum * 2;
			} else {
				cNum = smallerNum * 2;
				if (X > Y) {
					aNum = (X - Y) ;
				} else {
					bNum = (Y - X) ;
				}
			}
		} else {
			aNum = X;
			bNum = Y;
		}
		
		System.out.println(A*aNum + B*bNum + C*cNum);
		
	}
}
