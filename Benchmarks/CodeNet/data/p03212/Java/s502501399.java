import java.util.Scanner;

public class Main {
	static int count = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String s = "" + n;
		add("" , n);
		sc.close();
		System.out.println(count);

	}
	public static void add(String s , long n) {
		for(int i = 1 ; i <= 3 ; i++) {
			String s2 = s;
			s2 += (i * 2 + 1);
			if(Long.valueOf(s2) <= n) {
				if(s2.contains("3") && s2.contains("5") && s2.contains("7")) {
					count++;
				}
				add(s2 , n);
			}
		}

	}
}

