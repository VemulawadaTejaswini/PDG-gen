import java.util.Scanner;

public class Main{
	static int gcd(int x,int y){
		if(x%y!=0)
			return gcd(y,x%y);
		else
			return y;
	}

	public static void main(String[] arts){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));
	}
}
