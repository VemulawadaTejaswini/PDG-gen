import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] num = new int[n];
		for(int i = 0;i != n; i++)
		{
			num[i] = sc.nextInt();
		}
			Arrays.sort(num);
		for(int i = 0;i != n; i++)
		{
			if(i < n-1)
			{
				System.out.print(num[i] + " ");
			} else {
				System.out.println(num[i]);
			}
		}
	}
}