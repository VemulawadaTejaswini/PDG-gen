import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,m,l;
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
		m=sc.nextInt();
		l=sc.nextInt();

		if(n<m && m>l) {
			System.out.println("Yes");
		}
		else if(n>m && m<l) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}

}