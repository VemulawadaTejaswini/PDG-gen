import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt();

		int count = 0;

		int flag = 0;

		for (int i = 0; i < s.length ;i++) {
			//count =  ((s[i] - 'a') % 26 + 'a');

			if (s[i] == 'a') {
				flag = 1;
			}

			count = 26 - (s[i] - 'a');

			if (count <= k) {
				s[i] = 'a';
				k = k - count;
				flag = 1;
			}

		//	System.out.println(count);
		}


		if (k > 0) {

			if (k >= 26 && flag == 1) {
				k = k - 26;
			}

			s[s.length -1] = (char) ((s[s.length -1] - 'a' + k) % 26 + 'a');
		}

		for (int i = 0; i < s.length ;i++) {
			System.out.print(s[i]);
		}



		System.out.println("");

		sc.close();
	}
}
