import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if((a*b%2==0)){
			System.out.print("No");
		}else{
			System.out.print("Yes");
	    }
	}
}