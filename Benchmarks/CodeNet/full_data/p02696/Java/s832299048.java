import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		long c = sc.nextLong();
		c = c > b ? ((b-1)==0?1:(b-1)):c;
		int e;
		e =(int)((a*c)/b-a*(c/b));
		System.out.println(e);
	}
}