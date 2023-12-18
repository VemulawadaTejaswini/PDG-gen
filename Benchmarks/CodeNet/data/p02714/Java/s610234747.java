import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;

		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				for(int k = j; k < s.length(); k++) {
					if( (s.charAt(i) != s.charAt(j)) && (s.charAt(i) != s.charAt(k) && (s.charAt(j) != s.charAt(k))) ) {
						if(j - i != k -j) {
							ans++;
						}
					}
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}

}