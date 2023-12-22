import java.util.Scanner;

public class Main{
	public static void main(string[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		String temp;
		try{
			temp = scan.next();
			a = Integer.parseInt(temp);
			temp = scan.next();
			b = Integer.parseInt(temp);
		}catch( NoSuchElementException e ){
			System.out.println(e);
		}catch( IllegalStateException e ){
			System.out.println(e);
		}
		System.out.println(a*b);
		return;
	}
}