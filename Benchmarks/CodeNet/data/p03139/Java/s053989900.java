import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(Math.min(a,b)+" "+(a+b-n));
	}
}