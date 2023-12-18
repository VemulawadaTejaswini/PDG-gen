import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();
		
		char replaceTo = '*';
		char replaceFrom = s.charAt(k - 1);
		
		
		String reString = s.replaceAll("[^" + replaceFrom+"]", "" + replaceTo);
		System.out.println(reString);
	}
}