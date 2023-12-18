import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int x=-1000;
		for (int i=0; i<N; i++){
			int temp = sc.nextInt();
			x = Math.max(x, temp);
		}
		x = Math.max(x, X+1);
		
		int y=1000;
		for (int i=0; i<M; i++){
			int temp = sc.nextInt();
			y = Math.min(y, temp);
		}
		y = Math.min(y, Y);
		
		if (x<=y)
			System.out.println("No War");
		else 
			System.out.println("War");

		sc.close();
	}

}
