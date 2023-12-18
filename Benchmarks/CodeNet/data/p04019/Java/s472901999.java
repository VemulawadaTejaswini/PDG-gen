import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] a = new boolean[256];
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)] = true;
		}
		if ((a['N'] ^ a['S']) || (a['W'] ^ a['E'])) {
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}

}
