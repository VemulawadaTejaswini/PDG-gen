import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author jasonsun0310
 */
public class Main {
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		C solver = new C();
		solver.solve(1, in, out);
		out.close();
	}

	static @SuppressWarnings("ALL")
	class C {
		private static final int MAXN = 100+5;
		private static final int NULL = -1;
		private int n;
		private int[][] memo = new int[3][MAXN];
		private int[][] map  = new int[3][MAXN];

		public void solve(int testNumber, InputReader in, OutputWriter out)
		{
			initialize(in, out);
			out.buildLine(dp(2, n));
			out.done();
		}

		private int dp(int r, int c)
		{
			if(memo[r][c] != NULL)
				return memo[r][c];
			if(r == 1)
			{
				int ret = 0;
				for(int i = c; i >= 1; i--)
				{
					ret += map[r][i];
				}
				return ret;
			}
			if(c == 1)
			{
				int ret = 0;
				for(int i = r; i >= 1; i--)
				{
					ret += map[i][c];
				}
				return ret;
			}
			int fromLeft = dp(r, c-1)+map[r][c], fromUp = dp(r-1, c)+map[r][c];
			return memo[r][c] = Math.max(fromLeft, fromUp);
		}

		private void initialize(InputReader in, OutputWriter out)
		{
			n = in.readInt();
			for(int i = 1; i <= 2; i++)
				for(int j = 1; j <= n; j++)
					map[i][j] = in.readInt();
			ArrayUtils.fill(memo, NULL);
		}
	}

	static @SuppressWarnings("ALL")
	class InputReader {
		final private int BUFFER_SIZE = 1<<16;
		private BufferedInputStream din;
		private byte[]              buffer;
		private int                 bufferPointer;
		private int                 bytesRead;

		public InputReader(InputStream stream)
		{
			din = new BufferedInputStream(stream);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public InputReader(String file_name)
		{
			try
			{
				din = new BufferedInputStream(new FileInputStream(file_name));
			} catch(Exception e)
			{
				throw new InputMismatchException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public int readInt()
		{
			int ret = 0;
			byte c = read();
			while(c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if(neg)
				c = read();
			do
			{
				ret = ret*10+c-'0';
			} while((c = read()) >= '0' && c <= '9');

			if(neg)
				return -ret;
			return ret;
		}

		private void fillBuffer()
		{
			try
			{
				bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			} catch(Exception e)
			{
				throw new InputMismatchException();
			}
			if(bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read()
		{
			if(bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
	}

	static @SuppressWarnings("ALL")
	class ArrayUtils {
		public static void fill(int[] arr, int from, int to, int val)
		{
			int len = to-from+1;
			arr[from] = val;
			for(int i = 1; i < len; i += i)
				System.arraycopy(arr, from, arr, from+i, ((len-i) < i) ? (len-i) : i);
		}

		public static void fill(int[][] arr,
		                        int[] dim1Range,
		                        int[] dim2Range,
		                        int val)
		{
			fill(arr[0], dim2Range[0], dim2Range[1], val);
			int len = dim2Range[1]-dim2Range[0]+1;
			for(int i = dim1Range[0]; i <= dim1Range[1]; i++)
				System.arraycopy(arr[0], dim2Range[0], arr[i], dim2Range[0], len);
		}

		public static void fill(int[][] arr, int val)
		{
			fill(arr,
			     new int[]{0, arr.length-1},
			     new int[]{0, arr[0].length-1},
			     val);
		}
	}

	static class OutputWriter {
		private final PrintWriter writer;
		private static StringBuilder builder = new StringBuilder();

		public void done()
		{
			print(builder);
			builder.setLength(0);
		}

		public void buildLine(int i)
		{
			builder.append(i).append("\n");
		}

		public OutputWriter(OutputStream outputStream)
		{
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer)
		{
			this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects)
		{
			for(int i = 0; i < objects.length; i++)
			{
				if(i != 0)
				{
					writer.print(' ');
				}
				writer.print(objects[i]);
			}
		}

		public void close()
		{
			writer.close();
		}
	}
}