import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			if(h == 0 && w == 0)
				break;
			else
				for(; h > 0; h--) {
					for(int j = w; j > 0; j--)
						System.out.print("#");

					System.out.println("");
				}

			System.out.println("");
		}
	}
}