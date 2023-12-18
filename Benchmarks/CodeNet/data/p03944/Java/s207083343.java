import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int n = sc.nextInt();
		int sum = W * H;

		int[] x = new int[n];
		int[] y = new int[n];
		int[] an = new int[n];
		for (int i = 0; i < n; i++)
		{
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			an[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = W;
		int down = 0;
		int up = H;
		
		for (int i = 0; i < n; i++)
		{
			if(an[i] == 1)
			{
				left = Math.max(x[i], left);
			}else if(an[i] == 2)
			{
				right = Math.min(x[i], right);
			}else if(an[i] == 3)
			{
				down = Math.max(y[i], down);
			}else if(an[i] == 4)
			{
				up = Math.min(y[i], up);
			}
		}
			
		if(right - left <= 0 || up - down <= 0)
		{
			System.out.println(0);
		}else
		{
			System.out.println((right - left ) * (up - down));
		}
			
	}
	

	
}
