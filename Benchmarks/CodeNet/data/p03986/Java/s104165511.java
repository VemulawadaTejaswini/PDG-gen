import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String r=s.next(),buf=r;
		int count=0;
		while(r!=(buf=r.replaceFirst("ST", ""))) {
			r=buf;
			count++;
		}
		System.out.println(count);
		System.out.println(r.length());
	}
}
