import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a == b && a != c) {
			System.out.println("Yes");
		}else if(a == c && a != b){
			System.out.println("Yes");
		}else if(b == c && a != b){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		scan.close();
	}
}