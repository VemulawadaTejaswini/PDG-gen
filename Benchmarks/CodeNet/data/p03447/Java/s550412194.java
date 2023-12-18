import java.util.Scanner;
class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),l;
		x=x-a;
		l=x%b;
		System.out.println(l);
	}
}
