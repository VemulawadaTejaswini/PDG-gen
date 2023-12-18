
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		char a[][] = new char[h][w];
		char anext[][] = new char[h][w];
		int atmp[] = new int[h];
		int max= 0;
		int blackar[][] = new int[h*w][2];
		int whar[][] = new int[h*w][2];
		int p=0;
		int pw=0;
		for (int i = 0; i < h; i++)
		{
				a[i]= sc.next().toCharArray();
				for (char j = 0; j < w; j++)
				{
					if(a[i][j]=='#')
					{
						blackar[p][0]=i;
						blackar[p][1]=j;
						p++;
					}
					else
					{
						whar[pw][0]=i;
						whar[pw][1]=j;
						pw++;
					}
				}
		}
		//a[1][1]='#';

/*		for (char i = 0; i < h; i++)
		{
			for (char j = 0; j < w; j++)
			{
				if(a[i][j]=='#')
				{
					blackar[p][0]=i;
					blackar[p][1]=j;
					p++;
				}
				else
				{
					whar[pw][0]=i;
					whar[pw][1]=j;
					pw++;
				}
			}
		}*/
		//blackar[p][0]=-1;
		//whar[pw][0]=-1;
		int maxp = p;
		int maxpw = pw;
    	int p2=p;
		p=0;
	    while(p<h*w)
	    {
			//int blackarnext[][] = new int[h*w][2];


		    int hap = 0;
			for (; p<maxp;p++)
			{
				int i = blackar[p][0];
				int j = blackar[p][1];
				//if(a[i][j] == '.')
				//{
					if(i-1>=0)
					{
						if (a[i-1][j] == '.')
						{
							a[i-1][j] = '#';
							blackar[p2][0]=i-1;
							blackar[p2][1]=j;
							p2++;
						}
					}
					if(j-1>=0)
					{
						if (a[i][j-1] == '.')
						{
							a[i][j-1] = '#';
							blackar[p2][0]=i;
							blackar[p2][1]=j-1;
							p2++;
						}
					}
					if(i+1<h)
					{
						if (a[i+1][j] == '.')
						{
							a[i+1][j] = '#';
							blackar[p2][0]=i+1;
							blackar[p2][1]=j;
							p2++;
						}
					}
					if(j+1<w)
					{
						if (a[i][j+1] == '.')
						{
							a[i][j+1] = '#';
							blackar[p2][0]=i;
							blackar[p2][1]=j+1;
							p2++;
						}
					}
				//}

		    }
			maxp=p2;
			max++;
			//blackarnext[p2][0]=-1;
			//blackar = blackarnext;
		}
	    max= max-1;
/*		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < w; j++)
			{
				if(a[i][j] == '.')
				{
					int localmax=2000;
					l2:for (int x = 0; x < h; x++)
					{
						for (int y = 0; y < w; y++)
						{
							if(a[x][y]=='#')
							{
								int length = Math.abs(i-x)+Math.abs(j-y);
								if(length<localmax)
								{
									localmax = length;
									if(localmax<max)
									{
										break l2;
									}
								}
							}
						}
					}
					if(max<localmax)
					{
						max = localmax;
					}
				}
			}
		}*/
/*		for (pw = 0; pw<maxpw; pw++)
		{
			int localmax=2000;
			l2:for (p = 0; p<maxp; p++)
			{
				int length = Math.abs(whar[pw][0]-blackar[p][0])+Math.abs(whar[pw][1]-blackar[p][1]);
				if(length<localmax)
				{
					localmax = length;
					if(localmax<=max)
					{
						break l2;
					}
				}
			}
			if(max<localmax)
			{
				max = localmax;
			}
		}*/
		int ans = max;

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}

}

