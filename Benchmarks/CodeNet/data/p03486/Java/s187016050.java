import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String [] ss = s.split("");
		String [] tt = t.split("");
		Arrays.sort(ss);
		Arrays.sort(tt, Collections.reverseOrder());
		if(String.valueOf(ss).compareTo(String.valueOf(tt)) < 0) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		sc.close();

	}

}
