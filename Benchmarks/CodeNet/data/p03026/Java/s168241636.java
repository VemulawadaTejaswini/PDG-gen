import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	ArrayList<ArrayList<Integer>> list = new ArrayList();
	int[] c;
	int cp;
	int ans;
	int[] ansl;
	int[] np;
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
		//ArrayList<MyClass> lists = new ArrayList<>();;
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		np = new int[n];
		Arrays.fill(np, 0);
		int[][] l = new int [n-1][2];

		//ArrayList<Integer> listA = new ArrayList();
		//listA.add(new int());
		//list.add(listA);
		for (int i = 0; i < n; i++)
		{
			ArrayList<Integer> listA = new ArrayList();
			list.add(listA);
		}
		for (int i = 0; i < n-1; i++)
		{
			l[i][0]=Integer.parseInt(sc.next())-1;
			l[i][1]=Integer.parseInt(sc.next())-1;
			np[l[i][0]]++;
			np[l[i][1]]++;
			list.get(l[i][0]).add(l[i][1]);
			list.get(l[i][1]).add(l[i][0]);
		}
		c = new int[n];
		ansl = new int[n];
		for (int i = 0; i < n; i++)
		{
			c[i] = Integer.parseInt(sc.next());
		}
		Arrays.parallelSort(c);
		int maxp=0;
		int max=0;
		for (int i = 0; i < n; i++)
		{
			if(max<np[i])
			{
				max = np[i];
				maxp = i;
			}
		}
		cp = n-1;
		ansl[maxp]=c[cp];
		cp--;
		ans = 0;
		int currentp = maxp;
		nar(currentp);

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
		for (int i = 0; i < n; i++)
		{
			out.print(ansl[i] + " ");
		}
		out.flush();
	}
    void nar (int ln)
    {
		ArrayList<Integer> nextps = new ArrayList();
		for (int ls: list.get(ln))
		{
			ans += c[cp];
			ansl[ls]=c[cp];
			cp--;
			for (int i = 0; i < list.get(ls).size(); i++)
			{
				if(list.get(ls).get(i)==ln)
				{
					list.get(ls).remove(i);
				}
			}
			nextps.add(ls);
		}
		int[][] nextp = new int [nextps.size()][2];
		for (int i = 0; i<nextps.size();i++)
		{
			nextp[i][0] = nextps.get(i);
			nextp[i][1] = np[nextps.get(i)];
		}
		Arrays.parallelSort(nextp, (a, b) -> Integer.compare(a[1], b[1]));
		for (int ls: list.get(ln))
		{
			nar(ls);
		}
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