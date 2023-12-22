import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i = sc.nextInt(); i>0; i--){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a*a == (b*b + c*c) || b*b == (a*a + c*c) || c*c == (a*a + b*b))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}