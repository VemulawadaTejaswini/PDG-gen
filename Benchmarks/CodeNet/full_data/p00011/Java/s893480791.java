import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			int w = sc.nextInt();
			int n = sc.nextInt();
			int x = 0;
				int[] num = new int[w];
					for(int i=0; i<w; i++)
					{
						num[i] = i+1;
					}
						for(int i=0; i<n; i++)
						{
							String[] str = sc.next().split(",");
							x = num[Integer.valueOf(str[0])-1];
							num[Integer.valueOf(str[0])-1] = num[Integer.valueOf(str[1])-1];
							num[Integer.valueOf(str[1])-1] = x;
						}
							for(int i=0; i<w; i++)
							{
								System.out.println(num[i]);
							}
	}
}