import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("3 3 ... .#. ...");
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
		for (int i = 0; i < h; i++)
		{
				a[i]= sc.next().toCharArray();
		}

		for (int i = 0; i < h; i++)
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
		}

		int ans = max;
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}