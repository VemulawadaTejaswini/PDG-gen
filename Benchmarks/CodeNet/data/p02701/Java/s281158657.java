import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> priseSet = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			String prise = sc.next();
			priseSet.add(prise);
		}

		System.out.println(priseSet.size());
		sc.close();
	}

}