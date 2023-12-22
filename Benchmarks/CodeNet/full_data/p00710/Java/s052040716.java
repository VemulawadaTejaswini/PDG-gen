import java.util.Scanner;
public class Main{
	public static void hanafuda(int num[], int p, int c)
	{
		int tmp[] = new int[c];
		for(int i = 0 ; i < c ; i++)
			tmp[i] = num[p + i - 1];
		for(int i = p - 2 ; i >= 0 ; i--)
			num[i + c] = num[i];
		for(int i = 0 ; i < c ; i++)
			num[i] = tmp[i];
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0 && r == 0)
				break;
			int num[] = new int[n];
			for(int i = n ; i > 0 ; i--)
				num[n - i] = i;
			for(int i = 0 ; i < r ; i++)
			{
				int p = sc.nextInt();
				int c = sc.nextInt();
				hanafuda(num,p,c);
			}
			System.out.println(num[0]);
		}
	}
}
