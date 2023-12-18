import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
	    int a = A+B;
		int b = A-B;
		int c = A*B;
		if (a>b&&a>c){
			System.out.print(a);
		}
		else if (b>a&&b>c){
			System.out.print(b);
		}
		else if (c>b&&c>a){
			System.out.print(c);
		}
	}
}