import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int q = scan.nextInt();
		
		while (q-- > 0) {
			int t = scan.nextInt();
			if (t == 1) {
				s = reverse(s);
			} else if (t == 2) {
				int t1 = scan.nextInt();
				if (t1 == 1) {
					s = scan.next() + s;
				} else if (t1 == 2) {
					s+= scan.next();
				}
			}
			
		}
		
		System.out.println(s);

	}

	private static String reverse(String s) {
		char[] sArray = s.toCharArray();
		
		for (int i = 0, j = s.length()-1; i < j; i++, j--) {
			char temp = sArray[i];
			sArray[i] = sArray[j];
			sArray[j] = temp;
		}
		
		return String.valueOf(sArray);
		
	}

}