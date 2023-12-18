import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int ans = 0;

		if(b <= c || d <= a){
			ans = 0;
		}
		else if(c <= a && b <= d){
			ans = b - a;
		}
		else if(a <= c && d <= b){
			ans = d - c;
		}
		else if( a <= c && c <= b && b <= d){
			ans = b - c;
		}
		else if( c <= a && a <= d && d <= b){
			ans = d-a;
		}
		System.out.println(ans);
	}
}