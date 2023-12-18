import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	long M = 1000000007;
	long[] fac = new long[300001];
	long[] ifac = new long[300001];
	int[][] a;
	int w,h;
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
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		//long r = Long.parseLong(sc.next());
		//int l = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//int k = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		//ArrayList<Integer> lists = new ArrayList<Integer>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[][] a = new int[h][w]; 
		a = new int[h][w]; 
		int numofb = 0;
		for(int i = 0; i < h; i++ )
		{
			String str = sc.next();
			char c[] = str.toCharArray();
			for(int j = 0; j < w; j++ )
			{
				if(c[j]=='#')
				{
					a[i][j] = -1;
					numofb++;
				}
				else
				{
					a[i][j] = 9999999;
				}
			}
		}
		int x=0, y=0;
		routc(x,y,1);
		if(a[h-1][w-1]==9999999)
		{
			out.println(-1);
		}
		else
		{
			out.println(w*h-numofb-a[h-1][w-1]);
		}

		out.flush();
	}
    void routc (int x, int y, int cv)
    {
		a[x][y]=cv;
		if(x-1 >= 0 && a[x-1][y] > cv)
		{
			routc(x-1,y,cv+1);
		}
		if(x+1 < h && a[x+1][y] > cv)
		{
			routc(x+1,y,cv+1);
		}
		if(y-1 >= 0 && a[x][y-1] > cv)
		{
			routc(x,y-1,cv+1);
		}
		if(y+1 < w && a[x][y+1] > cv)
		{
			routc(x,y+1,cv+1);
		}
    }
    long mpow(long x, long n){
        long ans = 1;
        while(n != 0){
            if(n%2==1) ans = ans*x % M;
            x = x*x % M;
            n = n >> 1;
        }
        return ans;
    }

    long comb(long a, long b){ //aCbをmod計算
        if(a == 0 && b == 0)return 1;
        if(a < b || a < 0)return 0;
        long tmp = ifac[(int)(a-b)]* ifac[(int)b] % M;
        return tmp * fac[(int)a] % M;
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