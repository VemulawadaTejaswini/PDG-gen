import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int search = sc.nextInt();
		int blue = sc.nextInt();
		int red = sc.nextInt();

		int total = 0;
		int blueCount = 0;

		while(true)
		{
			for(int i=0; i<blue; i++)
			{
				//blue
				if(total < search)
				{
					total += 1;
					blueCount += 1;
				}
				else break;
			}

			for(int i=0; i<red; i++)
			{
				//red
				if(total < search) total += 1;
				else break;
			}

			if(total == search) break;
		}

		System.out.println(blueCount);

	}
}
