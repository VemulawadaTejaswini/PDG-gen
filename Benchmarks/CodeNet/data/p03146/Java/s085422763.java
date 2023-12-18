import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		Set<Integer>  set = new HashSet<Integer> ();
		int count =1;
		set.add(s);
		while (true) {
			if (s%2==0) {
				s=s/2;
			} else {
				s=3*s+1;
			}
			if (set.contains(s)==true) {
				System.out.println(count+1);
				break;
			}
			set.add(s);
			count++;
		}
	}
}