import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println(gcd(a,b));
	}
	
	public static int gcd(int a,int b){
		return b==0 ? a : gcd(b,a%b);
	}

}