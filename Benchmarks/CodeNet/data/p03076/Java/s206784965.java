import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int na[] = new int[n];
		int ans = 0;
		int min = 10;
		for (int i = 0; i < n; i++)
		{
			na[i] = sc.nextInt();
			if(min > na[i]%10 && 0 != na[i]%10)
			{
				min = na[i]%10;
			}
			ans += (int)(Math.ceil(((double)na[i])/10) * 10);
		}
		if(min != 10) {
			ans = ans - 10 + min;
		}
		

		System.out.println(ans);

	}
}