import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
	}
}