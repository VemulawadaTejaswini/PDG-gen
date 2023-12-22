
import java.util.Scanner;

public class Main {

	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);

			while(sc.hasNext()) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				for (int i=0; i<a; i++)
				{
					for(int j=0; j<b; j++)
					{
						if(j==(b-1))
							System.out.printf("#\n");
						else
							System.out.printf("#");

					}

				}
			}
	}
}
