import java.util.*;

public class Main{
	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		String[] num = input.split("\\s");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		if( a < b){
			System.out.println("a < b");
		} else if( a > b){
			System.out.println("a > b");
		} else{
			System.out.println("a == b");
		}
	}
}