import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String context = scan.next();
		String reversed = new StringBuilder(context).reverse().toString();
		
		System.out.println(reversed);
	}

}