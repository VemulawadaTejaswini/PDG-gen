import java.util.Scanner;

class Main{
	public static void main(String[] ags) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int X=sc.nextInt();

		if(B-A<2*X) {
			for(int i=A; i<=B; i++) {
				System.out.println(i);
			}
		}
		else {
			for(int i=0; i<X; i++) {
				System.out.println(A+i);
			}

			for(int i=X-1; i>=0; i--) {
				System.out.println(B-i);
			}
		}
	}
}