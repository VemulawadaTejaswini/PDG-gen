import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nectInt();
		if(a < b){
			if(b < c){
				 System.out.println("Yes");
			}else 
				System.out.println("No");
		}else
			System.out.println("No");
	}
}