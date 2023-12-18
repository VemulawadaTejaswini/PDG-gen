    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);
			
			int[][] a = new int[3][3];
			int count=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=scan.nextInt();
				}
			}
			int n = scan.nextInt();
			int[] b = new int[n];
			for(int i=0;i<n;i++)
			{
				b[i]=scan.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<3;j++)
				{
					for(int k=0;k<3;k++)
					{
						if(a[j][k]==b[i])
							a[j][k]=0;
					}
				}
			}
			int[] d = {0, 0};
        for(int i = 0; i < 3; i++ )
			{
				int v = 0;
				int h = 0;
				for(int j = 0; j < 3; j++) 
				{
					v += a[j][i];
					h += a[i][j];
				}
				if(v == 0 || h == 0)
				{
					System.out.println("Yes");
					return;
				}
            d[0] += a[i][i];
            d[1] += a[i][2 - i];
        }
        if(d[0] == 0 || d[1] == 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
			
		}
	}
	