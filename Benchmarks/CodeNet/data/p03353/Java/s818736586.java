
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set <String> L = new HashSet<String>();
		
		
		String s = sc.next();
		int k = Integer.parseInt(sc.next());
		
		for(int i = 1 ; i <= Math.min(k, s.length()) ;i++) {
			for(int j = 0 ; j <= s.length() - i ; j++) {
				L.add(s.substring(j, j+i));
			}
		}
		String []substring = L.toArray(new String[0]);
		Arrays.sort(substring);
		
		System.out.println(substring[k-1]);
		

	}

}
