
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	static int n;
	static int a;
	static int b;

	public static void main(String[] args) 
	{
		while(true)
		{
			n = scan.nextInt();
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(n == 0 && a == 0 && b == 0) {return;}
			
			int ans = n;
			
			//make a the smaller one and b the larger
			if(a > b)
			{
				int temp = a;
				a = b;
				b = temp;
			}
			
			int jump = b%a;
			//cost to jump = b
			
//			ArrayList<Integer> boffsets = new ArrayList<Integer>();
			
			for(int area = 0; true; area++)
			{
				int landed = (b*area)%a;
//				System.out.println("landed: " + landed);
				if(area != 0 && landed == 0) 
				{
					break;
					//went full circle
				}
//				boffsets.add(landed);
				
				int start = (b*area); //
				
				if(start > n)break;
				int end = (b*(area+1))-1; //
				
				
				int remove = (((n - start)/a) + 1);
				if(start == 0) {remove -= 1;}
//				System.out.println("[b * " + area + "] Can express: " + start + " + " + a + "k" + ", removing " + remove + " numbers");
				
				ans -= remove;
			}
			
			System.out.println(ans);
		}
	}

}

