import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int ans = 0;
		for(int i=1; i<=100; i++) {
			String value = String.valueOf(2019*i);

			int index = 0;
			while(index < s.length()) {
				index = s.indexOf(value, index);
				if(index == -1)
					break;

				ans ++;
				index++;
			}
		}

		System.out.println(ans);
	}
}
