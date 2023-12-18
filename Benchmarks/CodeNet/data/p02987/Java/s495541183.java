import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		String[] a=str.split("");
		if(a[0]==a[1]&&a[1]!=a[2]&&a[2]==a[3])
			System.out.println("Yes");
		else if(a[0]!=a[1]&&a[0]==a[2]&&a[1]==a[3])
			System.out.println("Yes");
		else if(a[0]==a[3]&&a[0]!=a[2]&&a[1]==a[2])
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
