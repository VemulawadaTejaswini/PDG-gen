import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,m,l;
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
		m=sc.nextInt();
		l=sc.nextInt();

		if(m>l) {
			System.out.println("Yes");
		}
		else if(m<l) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}

}