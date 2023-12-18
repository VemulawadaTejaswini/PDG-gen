import java.util.*;
public class Main {
	public static void main(String[] args){
		stringRotation();
	}
	
	public static void stringRotation() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		for (int i=0; i<s.length(); i++) {
			int j=0;
			while (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
				if (i == s.length()) i=0;
				if (j == t.length()) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}