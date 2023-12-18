import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n,a,b;
		n=stdin.nextInt();
		a=stdin.nextInt();
		b=stdin.nextInt();
		if(n*a>b){
			System.out.println(a*n);
		}
		else{
			System.out.println(b);

		}
	}

}
