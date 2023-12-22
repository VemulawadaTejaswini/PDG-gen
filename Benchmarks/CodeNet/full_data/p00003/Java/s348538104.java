import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		for(int d = 0;d<n;d++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(a*a+b*b == c*c || b*b+c*c == a*a || c*c+a*a == b*b){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}