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
/*		FastScanner sc = new FastScanner("6 6 \r\n" +
				"..#..#\r\n" +
				"......\r\n" +
				"#..#..\r\n" +
				"......\r\n" +
				".#....\r\n" +
				"....#.");*/
    	//FastScanner sc = new FastScanner("1000000000000");
		//long n = Long.parseLong(sc.next());
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
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
		//ArrayList<MyClass> lists = new ArrayList<>();;
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		
		int k[] = new int[m];
		int s[][]= new int[m][n];
		int p[] = new int[m];
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++ )
			{
				s[i][j] = 0;
			}
		}

		for(int i = 0; i < m; i++)
		{
			k[i] = Integer.parseInt(sc.next());
			for(int j = 0; j < k[i]; j++ )
			{
				s[i][Integer.parseInt(sc.next())-1] = 1;
			}
			
		}
		for(int i = 0; i < m; i++)
		{
			p[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		for(int x = 0; x < Math.pow(2,n); x++)
		{
			int c[] = new int[n];
			for(int i = 0; i < n; i++)
			{
				c[i] = (x>>i)%2;
			}
			int ok = 1;
			for(int i = 0; i < m; i++)
			{
				int ta = 0;
				for(int j = 0; j < n; j++ )
				{
					
					if(s[i][j] ==1 && c[j]==1)
					{
						ta++;
					}
				}
				if(ta%2!=p[i])
				{
					ok = 0;
				}
			}
			if(ok == 1)
			{
				ans++;
			}
		}
		
//		Arrays.parallelSort(b, (ba, bb) -> String.compare(ba[0], bb[0]));

		//Collections.sort(lists, new Comparator<MyClass>() {
		//	@Override
		//	public int compare(MyClass name1, MyClass name2) {
		//		if(name1.getName().compareTo(name2.getName())==0) return new Integer(name2.val).compareTo(name1.val);
		//		else return name1.getName().compareTo(name2.getName());
		//	}
		//});
		//for(int i = 0; i < n; i++)
		//{
		//	out.println(lists.get(i).num);
		//}
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
