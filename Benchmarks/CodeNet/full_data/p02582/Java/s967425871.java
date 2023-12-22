import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		int count = 0;


		String S1 = S.substring(0,1);
		String S2 = S.substring(1,2);
		String S3 = S.substring(2,3);

		while(count < 1)
		{
			if((S1 + S2 + S3).equals("RRR"))
			{
				count += 3;
				break;
			}

			if((S1 + S2).equals("RR") || (S2 + S3).equals("RR"))
			{
				count += 2;
				break;
			}

			if(S1.equals("R") || S2.equals("R") || S3.equals("RR"))
			{
				count += 1;
				break;
			}
		}

		System.out.println(count);

		scan.close();
	}
}
