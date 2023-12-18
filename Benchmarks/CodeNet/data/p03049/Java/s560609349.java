import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String[] s = new String[N];

		int ab = 0;
		int a_end = 0;
		int b_start = 0;
		for(int i=0;i<N;i++) {
			s[i] = sc.nextLine();

			int fromIndex = 0;
			while((fromIndex = s[i].indexOf("AB", fromIndex)) != -1) {
				fromIndex++;
				ab++;
			}

			if(s[i].endsWith("A")) a_end++;
			if(s[i].startsWith("B")) b_start++;
		}

		System.out.println(ab + Math.min(a_end,b_start));
	}

}