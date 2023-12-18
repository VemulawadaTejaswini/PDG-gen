import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char[] c = s.toCharArray();

		int count = 0;
		for(int i=0;i<c.length/2;i++) {
			if(c[i] != c[c.length-i-1]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
