import java.util.Scanner;

public class Main {
	//?????°
	public static int a,b;
	//????????????
	
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print(a*b);
		System.out.print("\t");
		System.out.print(a+b+a+b);
	}

	public static void main(String[] args) {
		solve();
	}

}