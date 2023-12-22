import java.util.Scanner;
public class Main{
	static int func(int a)
	{	
		return a=(a==1||a==2)?1:func(a-1)+func(a-2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(func(n)+1);
	}

}