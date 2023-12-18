import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);

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

	    while(blackar[0][0]!=-1)
	    {
			int blackarnext[][] = new int[h*w][2];
			int p2=0;
		    int hap = 0;
			for (p = 0; p<maxp; p++)
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
							blackarnext[p2][0]=i-1;
							blackarnext[p2][1]=j;
							p2++;
						}
					}
					if(j-1>=0)
					{
						if (a[i][j-1] == '.')
						{
							a[i][j-1] = '#';
							blackarnext[p2][0]=i;
							blackarnext[p2][1]=j-1;
							p2++;
						}
					}
					if(i+1<h)
					{
						if (a[i+1][j] == '.')
						{
							a[i+1][j] = '#';
							blackarnext[p2][0]=i+1;
							blackarnext[p2][1]=j;
							p2++;
						}
					}
					if(j+1<w)
					{
						if (a[i][j+1] == '.')
						{
							a[i][j+1] = '#';
							blackarnext[p2][0]=i;
							blackarnext[p2][1]=j+1;
							p2++;
						}
					}
				//}
		    }
			max++;
			blackarnext[p2][0]=-1;
			maxp=p2;
			blackar = blackarnext;
		}
	    max= max-1;
		int ans = max;

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(String in) {
        	StringReader sr = new StringReader(in);
            reader = new BufferedReader(new BufferedReader(sr));
            tokenizer = null;
        }
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
 
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
 
            return tokenizer.nextToken("\n");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
        
        public long nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}