

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long W=sc.nextLong();

		if(A%W==0 || B%W==0) {
			System.out.println(B/W-A/W+1);
		}
		else {
			System.out.println(B/W-A/W);
		}
	}
}