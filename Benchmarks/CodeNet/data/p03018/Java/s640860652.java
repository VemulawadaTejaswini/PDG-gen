import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	char[] ar;
	int n;
	int ans;
    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
		//int n = Integer.parseInt(sc.next());
		//int a = Integer.parseInt(sc.next())-1;
		//int b = Integer.parseInt(sc.next())-1;
		//int c = Integer.parseInt(sc.next())-1;
		//int d = Integer.parseInt(sc.next())-1;
		String s = sc.next();
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
		ar = s.toCharArray();
		n = ar.length;
		ans = 0;

		int p = 0;
		int prep=0;
		int f = 1;
		int AA = 0;
		while(p<n)
		{
			if(ar[p]=='A')
			{
				prep=p;
				p=check2(p);
				if(prep == p)
				{
					AA++;
				}
				else
				{
					ans += AA;
					AA = 1;
				}
			}
			else
			{
				AA=0;
			}
			p++;
		}

		//ArrayList<Integer> listA = new ArrayList();
		//listA.add(new int());
		//list.add(listA);

		out.println(ans);

		out.flush();
	}
    int check2 (int p)
    {
    	if(checke(p) == 1)
    	{
    		ans++;
    		//check2(p-1);
    		if(check2(p+2)!=p)
    		{
    			return p+2;
    		}
    		else
    		{
    			return p;
    		}
    	}
    	else
    	{
    		return p;
    	}
    }
    int checke (int p)
    {
		if(p>=0 && p+2 < n && ar[p+1]=='B' && ar[p+2]=='C')//ar[p]=='A' && 
		{
			ar[p]='B';
			ar[p+1]='C';
			ar[p+2]='A';
			return 1;
		}
		else
		{
	    	return 0;
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