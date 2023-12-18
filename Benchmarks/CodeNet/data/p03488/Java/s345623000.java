import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = s.length();
		boolean[] ax = new boolean[20000];
		boolean[] ay = new boolean[20000];
		int offset = 10000;
		
		ay[offset] = true;
		int rot = 0;
		int fw = 0;
		for(int i = 0; i <= n; i++)
		{
			if(i < n && s.charAt(i) == 'F')
			{
				fw++;
			}
//			if(s.charAt(i) == 'T')
			else
			{
				rot++;
				
				if(rot%2 == 0)
				{ //any vertical
					boolean[] nay = new boolean[20000];
					for(int k = 0; k < 20000; k++)
					{
						if(ay[k])
						{
							if(k+fw<20000)nay[k+fw]=true;
							if(k-fw>=0)nay[k-fw]=true;
						}
					}
					ay = nay;
				}
				else
				{ //horizontal
					if(rot == 1)
					{ //only right
						ax[fw+offset] = true;
					}
					else
					{ //any horizontal
						boolean[] nax = new boolean[20000];
						for(int k = 0; k < 20000; k++)
						{
							if(ax[k])
							{
								if(k+fw<20000)nax[k+fw]=true;
								if(k-fw>=0)nax[k-fw]=true;
							}
						}
						ax = nax;
					}
				}
				
				fw = 0;
			}
			
		}
		
		if(ax[x+offset] && ay[y+offset])
		{
			System.out.println("Yes");
		}
		else System.out.println("No");
	}

}
