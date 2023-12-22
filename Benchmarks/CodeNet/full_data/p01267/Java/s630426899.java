import java.util.Scanner;

public class Main {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int limit = 10000;


		while(true)
		{


		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = sc.nextInt();


		if(N == 0 && A == 0 && B == 0 && C == 0 && x == 0)
			return;;

		int[] Y = new int[N];

		for(int i=0;i<N;i++)
		{
			Y[i] = sc.nextInt();

		}

		int count = 0;
		int i;
		boolean flag = true;
		for(i=0;i<N;i++)
		{
			if(count > limit)
				break;

			while(true)
			{
				if(count > limit)
					break;

				if(x == Y[i] && flag)
				{
					flag =false;
					break;
				}
				
				x = (A * x + B)  % C;
				count++;
				flag = true;


			}


		}

		System.out.println( count <= limit ? count : -1 );
		}


	}

}