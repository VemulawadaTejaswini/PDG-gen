import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new java.util.Scanner (System.in);

		String s = sc.next();
		String[] list = new String [s.length()];
		list = s.split("");
		int count = 0;
		for (int index=0; index<s.length()/2; index++) {
			if (list[index].equals(list[s.length()-index-1])) {
			} else {
				count++;
			}
		}

		System.out.println(count);
	}
}