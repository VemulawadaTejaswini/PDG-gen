import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long n=stdIn.nextLong(),s=1,i;
		for(i=2;i<=n;i++) {
			s*=i;
			s%=1000000007;
		}
		System.out.print(s);
	}
}