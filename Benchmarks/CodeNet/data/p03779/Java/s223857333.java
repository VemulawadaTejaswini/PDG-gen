import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			
			
			int n = 0;
			while(true) {
				if(X==n*(n+1)/2) {//ぴったり一致したらそこで終了。
					System.out.println(n);
					System.exit(0);
				}
				
				if(X<n*(n+1)/2) {//超えたら終了。
					break;
				}
				n++;
				//System.out.println(n);
			}
			
			//ここ以降のｎは
			
			System.out.print(X-(n-2)*(n-1)/2);
			
			
		}
		
		
	}
		

}
