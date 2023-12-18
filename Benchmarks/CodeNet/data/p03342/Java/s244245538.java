public class Main  implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }
    public void run() {
    	FastScanner sc = new FastScanner(System.in);
    	int n = Integer.parseInt(sc.next());
		PrintWriter out = new PrintWriter(System.out);
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(sc.next());
		}
		int ans = 1;
		int r=0;
		int l=0;
		int cv = a[0];
		while(r < n-1)
		{
			if((cv^a[r+1]) == cv+a[r+1])
			{
				r++;
				ans += r-l+1;
				cv = cv ^ a[r];
			}
			else
			{
				if(r==l)
				{
					r++;
					l++;
					ans++;
					cv = a[r];
				}
				else
				{
					cv = cv ^ a[l];
					l++;

				}
			}
		}
		out.printf("%d",ans);
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
    }
}