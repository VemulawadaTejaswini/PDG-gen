import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] mask = new int[20];
		int curm = 1;
		for(int i = 0; i < 20; i++)
		{
			mask[i] = curm;
			curm*=2;
		}
		
		int[] lasto = new int[20];
		for(int i = 0; i < 20; i++)
			lasto[i] = -1;
		
		//dont forget singles
		long sco = 0;
		int forbid = -1;
		for(int i = 0; i < n; i++)
		{
			long cura = sc.nextLong();
			
			for(int j = 0; j < 20; j++)
			{
				if((mask[j] & cura) > 0)
				{ //has this bit
					if(lasto[j] != -1)
					{
						forbid = Math.max(forbid, lasto[j]);//+1
					}
				}
			}
			sco += i - forbid;
			
			
			for(int j = 0; j < 20; j++)
			{
				if((mask[j] & cura) > 0)
				{ //has this bit
					lasto[j] = i;
				}
			}
		}
		System.out.println(sco);
	}

}
