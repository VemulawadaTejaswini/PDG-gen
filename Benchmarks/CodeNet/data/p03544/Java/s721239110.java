import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),i;
		long a[]=new long[3];
		a[0]=2;
		a[1]=1;
		for(i=0;i<n;i++) {
			a[2]=a[0]+a[1];
			a[0]=a[1];
			a[1]=a[2];
		}
		System.out.print(a[0]);
	}
}