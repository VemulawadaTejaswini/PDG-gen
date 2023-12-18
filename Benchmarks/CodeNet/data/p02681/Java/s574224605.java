import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();

		int num = s.length();
		String check = t.substring(0, num);

		if(s.equals(check)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}