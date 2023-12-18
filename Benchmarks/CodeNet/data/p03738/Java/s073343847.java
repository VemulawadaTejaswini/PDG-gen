import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();

		if(a.length() > b.length()){
			System.out.println("GREATER");
		} else if(a.length() < b.length()){
			System.out.println("LESS");
		} else {
			for(int i = 0 ; i < a.length() ; i++){
				if(a.charAt(i) > b.charAt(i)){
					System.out.println("GREATER");
					break;
				} else if(a.charAt(i) > b.charAt(i)){
					System.out.println("LESS");
					break;
				} else {
					System.out.println("EQUAL");
				}
			}
		}
	}
}
