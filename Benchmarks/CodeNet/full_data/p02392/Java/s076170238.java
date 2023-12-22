package package2;
import java.util.Scanner;
public class Range {

	public static void main(String[] args) {
		int a;
		int b = 0;
		int c = 0;
		Scanner scan = new Scanner(System.in);
	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();
		if(a < b ) && (a < c){
			if(b < c){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else if(a > b ) && (a > c){
			System.out.println("NO");

		}
	}

}