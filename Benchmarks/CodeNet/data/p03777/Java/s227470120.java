import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		String t = scan.next();

		if(s.equals("H")){
			if(t.equals("H")){
				System.out.println("H");
			}
			else{
				System.out.println("D");
			}
		}
		else{
			if(t.equals("H")){
				System.out.println("D");
			}
			else{
				System.out.println("H");
			}
		}
	}
}
