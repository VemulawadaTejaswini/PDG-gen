import java.util.Scanner;

public class Main {
	static  int c=1;
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int m=stdin.nextInt();
		int ans=0;

		if(n>1 && m>1)
			ans=(n-2)*(m-2);
		else if(n==1 && m>1)
			ans=m-2;
		else if(m==1 && n>1)
			ans=n-2;
		else if(n==1 && m==1)
			ans=1;
		System.out.println(ans);
	}
}
