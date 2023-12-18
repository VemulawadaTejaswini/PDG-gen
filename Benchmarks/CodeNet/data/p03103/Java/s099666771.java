import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long m = sc.nextLong();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			points[i] = new Point(a, b);
		}
		Arrays.sort(points);
		long cost = 0;
		long number = 0;
		int i = 0;
		while (number < m) {
			if (number + points[i].num > m) {
				points[i].num = m - number;
			}
			number += points[i].num;
			cost += points[i].cost * points[i].num;
			i++;
		}
		System.out.println(cost);
		

	}
	static class Point implements Comparable<Point> {
		long cost;
		long num;
		Point (long c, long n) {
			cost = c;
			num = n;
		}
		
		public int compareTo (Point p) {
			return (int)(cost - p.cost);
		}
	}
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
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
}
