import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int i; 
		while(true){
			
			int n = scan.nextInt();
			
			if(n == 0) break;
			System.out.print(" ");
			for(i=1; i<=n; i++){
				if(i%3 == 0){
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}