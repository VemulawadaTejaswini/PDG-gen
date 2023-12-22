import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int e = sc.nextInt();
			if(e == 0)
				break;
			int m;
			int k = 100000000;
			int a = (int)Math.sqrt(e);
			int b = (int)Math.cbrt(e);
			for(int i = 0; i < a + 1; i++)
				for(int j = 0; j < b + 1; j++) {
					m = e - (i * i) - (j * j * j) + i + j;
					if(k > m && (e - i * i - j * j * j) > 0 )
						k = m;
				}
			System.out.println(k);
		}
	}
}


