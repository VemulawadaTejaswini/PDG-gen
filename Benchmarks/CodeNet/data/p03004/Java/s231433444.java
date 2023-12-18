import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable {

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//ar[1]=Integer.parseInt(sc.next());
    	//ar[2]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		int n = Integer.parseInt(sc.next());
		//long k = Long.parseLong(sc.next());
		//int k = Integer.parseInt(sc.next());
		//String s = sc.next();
		//int k = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		///String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		//ArrayList<Integer> lists = new ArrayList<Integer>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		int[][] xyd = new int[n][3];
		for(int i = 0; i < n; i++)
		{
			xyd[i][0] = Integer.parseInt(sc.next())*2;
			xyd[i][1] = Integer.parseInt(sc.next())*2;
			char c = sc.next().toCharArray()[0];
			int ci;
			if(c == 'L')
			{
				ci = 0;
			}
			else if(c == 'R')
			{
				ci=1;
			}
			else if(c == 'U')
			{
				ci=2;
			}
			else
			{
				ci=3;
			}
			xyd[i][2] = ci;
		}//[LRUD][xmin,xmax,ymin,ymax]]
		int[][] a= new int[4][4];
		int[] ex = new int[4];
		for(int i = 0; i < 4; i++)
		{
			ex[i] = 0;
		}
		for(int i = 0; i < n; i++)
		{
			if(ex[xyd[i][2]]==0)
			{
				a[xyd[i][2]][0]=xyd[i][0];
				a[xyd[i][2]][1]=xyd[i][0];
				a[xyd[i][2]][2]=xyd[i][1];
				a[xyd[i][2]][3]=xyd[i][1];
				ex[xyd[i][2]]++;
			}
			else
			{
				if(a[xyd[i][2]][0] > xyd[i][0])
				{
					a[xyd[i][2]][0]=xyd[i][0];
				}
				if(a[xyd[i][2]][1] < xyd[i][0])
				{
					a[xyd[i][2]][1]=xyd[i][0];
				}
				if(a[xyd[i][2]][2] > xyd[i][1])
				{
					a[xyd[i][2]][2]=xyd[i][1];
				}
				if(a[xyd[i][2]][3] < xyd[i][1])
				{
					a[xyd[i][2]][3]=xyd[i][1];
				}
			}
		}
		int exn = 3;
		if(ex[0]>0)
		{
			exn=0;
		}
		else if(ex[1]>0)
		{
			exn=1;
		}
		else if(ex[2]>0)
		{
			exn=2;
		}
		int ansxmin = Math.min(Math.min(a[0][0], a[1][0]),Math.min(a[2][0], a[3][0]));
		int ansxmax = Math.max(Math.max(a[0][1], a[1][1]),Math.max(a[2][1], a[3][1]));
		int ansymin = Math.min(Math.min(a[0][2], a[1][2]),Math.min(a[2][2], a[3][2]));
		int ansymax = Math.max(Math.max(a[0][3], a[1][3]),Math.max(a[2][3], a[3][3]));
		long ans = (long)(ansxmax-ansxmin)*(long)(ansymax-ansymin);
		long anstmp =ans;
		ans++;
		int i=0;

		while(anstmp<ans)
		{
			ans = anstmp;
			if(ex[0]==0)
			{
				for(int j = 0; j < 4; j++)
					a[0][j]=a[exn][j];
			}
			else
			{
				a[0][0]--;
				a[0][1]--;
			}
			if(ex[1]==0)
			{
				for(int j = 0; j < 4; j++)
					a[1][j]=a[exn][j];
			}
			else
			{
				a[1][0]++;
				a[1][1]++;
			}
			if(ex[2]==0)
			{
				for(int j = 0; j < 4; j++)
					a[2][j]=a[exn][j];
			}
			else
			{
				a[2][2]++;
				a[2][3]++;
			}

			if(ex[3]==0)
			{
				for(int j = 0; j < 4; j++)
					a[3][j]=a[exn][j];
			}
			else
			{
				a[3][2]--;
				a[3][3]--;
			}
			ansxmin = Math.min(Math.min(a[0][0], a[1][0]),Math.min(a[2][0], a[3][0]));
			ansxmax = Math.max(Math.max(a[0][1], a[1][1]),Math.max(a[2][1], a[3][1]));
			ansymin = Math.min(Math.min(a[0][2], a[1][2]),Math.min(a[2][2], a[3][2]));
			ansymax = Math.max(Math.max(a[0][3], a[1][3]),Math.max(a[2][3], a[3][3]));
			anstmp = (long)(ansxmax-ansxmin)*(long)(ansymax-ansymin);
			//out.println(anstmp);
		}
		if(ans%4l==0)
		{
			out.println(ans/4l);
		}
		else
		{
			out.println((double)(ans)/(double)4);
		}


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