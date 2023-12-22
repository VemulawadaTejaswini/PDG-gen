import java.util.Scanner;

public class aoj0011
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
							String str = sc.next();
								x = num[(int)str.charAt(0)-49];
								num[(int)str.charAt(0)-49] = num[(int)str.charAt(2)-49];
								num[(int)str.charAt(2)-49] = x;
						}
							for(int i=0; i<w; i++)
							{
								System.out.println(num[i]);
							}
	}
}