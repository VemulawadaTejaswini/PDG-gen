import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		int[] b=new int[4];
		int a_p=0,b_p=0;
		for(int i=0; i<4; i++) {
			a[i]=sc.nextInt();
			a_p+=a[i];
		}

		for(int i=0; i<4; i++) {
			b[i]=sc.nextInt();
			b_p+=b[i];
		}

		System.out.println(Math.max(a_p, b_p));
	}
}

