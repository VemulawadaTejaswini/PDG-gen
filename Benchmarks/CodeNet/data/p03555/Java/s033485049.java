import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner scanner=new Scanner(System.in);
		String first=scanner.nextLine();
		String second=scanner.nextLine();
		StringBuffer sb=new StringBuffer(first);
		sb.reverse();
		String result=sb.toString();
		System.out.println(result.equals(second));
	}
}