import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		for(int i=l;i>1;i--) {
			String a = s.substring(0, i/2);
			String b = s.substring(i/2, i);
			if(a.equals(b)) {
				System.out.println(i);
				return;
			}
		}
	}

}