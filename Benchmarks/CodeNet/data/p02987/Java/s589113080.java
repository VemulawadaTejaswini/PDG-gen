import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		String[] a=str.split("");
		if(a[0]==a[1]&&a[0]!=a[2]&&a[0]!=a[3])
			System.out.println("Yes");
		else if(a[0]!=a[1]&&a[0]==a[2]&&a[0]!=a[3])
			System.out.println("Yes");
		else if(a[0]!=a[1]&&a[0]!=a[2]&&a[0]==a[3])
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}