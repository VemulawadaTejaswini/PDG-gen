import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a,b;
		float f;
		
		a = in.nextInt();
		b = in.nextInt();
		
		f = ((float)a)/((float)b);
		
		System.out.println(a/b+" "+a%b+" "+f);
	}
}