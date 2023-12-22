import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int g,r;

		Scanner scan = new Scanner(System.in);

		while(true)
		{
			g = scan.nextInt();
			r = scan.nextInt();

			if( (g|r) == 0) break;

			for(int i=0; i<g; i++)
			{
				for(int j=0; j<r; j++)
				{
					System.out.print("#");
				}

				System.out.println();
			}

			System.out.println();

		}

		scan.close();

	}
}