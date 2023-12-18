import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		String ans[] = new String[100];
		char tmp[][] = new char[100][100];
		StringBuffer black = new StringBuffer();
		StringBuffer white = new StringBuffer();
		for (int i = 0; i < 100; ++i) {
			black.append("#");
			white.append(".");
		}
		int k = 50;
		for (int i = 0; i < k; ++i)
			tmp[i] = black.toString().toCharArray();

		for(int i = 0; i < k; ++i)
			tmp[i + 50] = black.toString().replaceAll("#", ".").toCharArray();
		
		int j = 0;
		for (int i = 0; i < a - 1; ++i) {
			int tmp2 = i * 2;
			tmp2 %= 100;
			if (tmp2 == 0)
				j += 2;
				tmp[j][tmp2] = '.';
		}
		j = 50;
		for(int i = 0; i < b - 1; ++i) {
			int tmp2 = i * 2;
			tmp2 %= 100;
			if(tmp2 == 0)
				j += 2;
			tmp[j][tmp2] = '#';
		}
		System.out.println(100 + " " + 100);
		for(int i = 0; i < 100; ++i) {
			for(j = 0; j < 100; ++j)
				System.out.print(tmp[i][j]);
			System.out.println();
		}
		
		
	}

}
