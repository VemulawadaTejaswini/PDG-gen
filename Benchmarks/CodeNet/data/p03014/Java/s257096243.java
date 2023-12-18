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
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		//int q = Integer.parseInt(sc.next());
		//int r = Integer.parseInt(sc.next());
		//int a = Integer.parseInt(sc.next())-1;
		//int b = Integer.parseInt(sc.next())-1;
		//int c = Integer.parseInt(sc.next())-1;
		//int d = Integer.parseInt(sc.next())-1;
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
		//ArrayList<MyClass> lists = new ArrayList<>();;
		//lists = new ArrayList;
		ArrayList<MyClass> emp = new ArrayList<MyClass>();
		ArrayList<Integer>[] hls= new ArrayList[h];
		ArrayList<Integer>[] vrs= new ArrayList[w];
		for(int i = 0; i < h; i++)
		{
			hls[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < w; i++)
		{
			vrs[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < h; i++)
		{
			char c[] = sc.next().toCharArray();
			for(int j = 0; j < c.length; j++)
			{
				if (c[j]=='.')
				{
					emp.add(new MyClass(j,i));
				}
				else
				{
					hls[i].add(j);
					vrs[j].add(i);
				}
			}
		}
		int max = 0;
		for(int i = 0; i < emp.size(); i++)
		{
			int y = emp.get(i).y;
			int x = emp.get(i).x;
			
			int mi = -1;
			int ma = w;
			for(int j = 0; j < hls[y].size(); j++)
			{
				if(hls[y].get(j) < x)
				{
					mi = hls[y].get(j);
				}
				else
				{
					ma = hls[y].get(j);
					break;
				}
			}
			int ans_x = ma-mi-1;
			mi = -1;
			ma = h;
			for(int j = 0; j < vrs[x].size(); j++)
			{
				if(vrs[x].get(j) < y)
				{
					mi = vrs[x].get(j);
				}
				else
				{
					ma = vrs[x].get(j);
					break;
				}
			}
			int ans_y = ma-mi-1;
			if(ans_y+ans_x > max)
			{
				max = ans_y+ans_x;
			}
		}

		//xx 1
		//xxx 2
		//xxxx 3
		//xxxxx 4
		//xxxxxx xoxoxx 221 3 2111 4 1111 1 = 8
		//xxxxxxx 222 1 2211


		PrintWriter out = new PrintWriter(System.out);
		out.println(max-1);

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


class MyClass {
	int x;
    int y;

    public MyClass(int x, int y) {
    	this.x = x;
        this.y = y;
    }

}