import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		
		for(int i = 0; i <= s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				String num = s.substring(i, j);
				long numint = Long.valueOf(num);
				if(numint % 2019 == 0) {
					ans++;
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}

}