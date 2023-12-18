import java.util.*;
import java.io.*;

public class Main {
	
  public static void main(String[] args) {
	  FastReader in = new FastReader();
    
    int N = in.nextInt();
    Num[] original = new Num[N];
    Num[] sorted = new Num[N];
    
    for (int i = 0; i < N; i++) {
    	int n = in.nextInt();
    	original[i] = new Num(i, n);
    	sorted[i] = new Num(i, n);
    }
    
    Arrays.sort(sorted);
    Map<Integer, Integer> order = new HashMap<Integer, Integer>(); // Keeps index in original => index in sorted
    for (int i = 0; i < N; i++) {
    	order.put(sorted[i].index, i);
    }
    
    for (int i = 0; i < N; i++) {
    	int index = order.get(original[i].index);
    	
    	if (index < N / 2) {
    		System.out.println(sorted[N / 2].n);
    	} else {
    		System.out.println(sorted[N / 2 - 1].n);
    	}
    }
  }
}

class Num implements Comparable<Num> {
	int index;
	int n;
	
	public Num(int index, int n) {
		this.index = index;
		this.n = n;
	}

	@Override
	public int compareTo(Num o) {
		return this.n - o.n;
	}
}

class FastReader
{
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new
                 InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}