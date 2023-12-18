import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int amari = N % 500;
		if( amari <= A ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		scan.close();
	}
}
