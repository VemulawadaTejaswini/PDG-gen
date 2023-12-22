import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		int a;
		int b = 0;
		int c = 0;
		Scanner scan = new Scanner(System.in);
	        a = scan.nextInt();
	        b = scan.nextInt();
	        c = scan.nextInt();

		if((a<b) && (b<c)){
			System.out.println("YES");
		}else{
			System.out.println("NO");

		}

	}

}