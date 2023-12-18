import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		boolean isDistinct = true;
		for(int i = 0; i < n; i++) {
			Integer x = scan.nextInt();
			if(set.contains(x)) isDistinct = false;
			set.add(x);
		}
		if(isDistinct) System.out.println("YES");
		else System.out.println("NO");
		scan.close();
	}

}
