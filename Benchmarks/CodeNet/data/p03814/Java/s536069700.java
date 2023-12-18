import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int indexOfA = s.indexOf('A');
		int indexOfZ = s.lastIndexOf('Z');
		String subst = s.substring(indexOfA, indexOfZ+1);
		int ans = subst.length();
		System.out.println(ans);
		sc.close();
	}
}