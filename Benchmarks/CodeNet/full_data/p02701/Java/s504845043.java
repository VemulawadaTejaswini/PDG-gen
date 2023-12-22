import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> set = new HashSet<String>();
		int count =0;
		for (int i=0;i<N;i++) {
			String temp = sc.next();
			if (set.contains(temp)==false) {
				count++;
				set.add(temp);
			}
		}
		System.out.println(count);
	}
}
