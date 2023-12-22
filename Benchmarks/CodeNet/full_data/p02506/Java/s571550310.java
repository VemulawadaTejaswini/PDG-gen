import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();
		String T;
		int counter = 0;
		while(!(T = sc.next()).equals("END_OF_TEXT")){
			if(T.equalsIgnoreCase(W)){
				counter++;
			}
		}
		System.out.println(counter);
 	}
}