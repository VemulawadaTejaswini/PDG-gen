import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner scanner=new Scanner(System.in);
		String first=scanner.nextLine();
		String middle=String.valueOf(first.length()-2);
		System.out.println(first.charAt(0)+middle+first.charAt(first.length()-1));
	}

}