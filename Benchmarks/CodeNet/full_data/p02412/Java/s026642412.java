import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int n = sc.nextInt();
		int x = sc.nextInt();
		int COUNT = 0;
		
		if(n == 0 && x == 0)
				break;

		for(int a = 1; a < n+1; a++)
			for(int b = a+1; b < n+1; b++)
				for(int c = b+1; c < n+1; c++)
					if (a+b+c == x)
						COUNT++;

		System.out.println(COUNT);
		
		}
	}
}

