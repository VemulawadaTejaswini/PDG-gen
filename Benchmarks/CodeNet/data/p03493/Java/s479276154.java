import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		int count=0;
		for(int i=0;i<a.length();i++) {
			String mozi = "1";
			char charAt = a.charAt(i);
			if(mozi.equals(charAt)) {
				count++;
			}
		}
		System.out.println(count);
	}
}