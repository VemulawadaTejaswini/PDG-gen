import java.util.Scanner;

public class Main {
	static int DP(int n) {
		int COUNT = 0; 
		for(int a = 0; a < 10; a++)
			for(int b = 0; b < 10; b++)
				for(int c = 0; c < 10; c++)
					for(int d = 0; d < 10; d++) {
						if((a + b + c + d) == n)
							COUNT++;
					}
		return COUNT;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(DP(n));
		}
	}
}

