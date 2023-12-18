import java.util.Scanner;

class PoorNumber {
	static boolean check(int a, int b, int c) {
		if((a==b&&b!=c)||(a==c&&a!=b)||(b==c&&a!=b))
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(check(a, b, c))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}