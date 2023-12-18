import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a,m=100000000,t,i;
		for(i=0;i<n;i++) {
			a=stdIn.nextInt();
			t=0;
			while(a%2==0) {
				a/=2;
				t++;
			}
			if(m>t) m=t;
		}
		System.out.print(m);
	}
}