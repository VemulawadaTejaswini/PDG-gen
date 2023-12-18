import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(BR.readLine()), Count = 0; Queue<Long> Numbers = new LinkedList<>(), nextNumbers = new LinkedList<>(); HashSet<Long> previousLunLun = new HashSet<>();
		if (K < 9)
		{
			System.out.println(K);
		}
		else
		{
			nextNumbers.add(1l); nextNumbers.add(2l); nextNumbers.add(3l); nextNumbers.add(4l); nextNumbers.add(5l); nextNumbers.add(6l); nextNumbers.add(7l); nextNumbers.add(8l); nextNumbers.add(9l);
			while (Count != K)
			{
				for (Long N : nextNumbers)
				{
					Numbers.add(N);
					previousLunLun.add(N);
				}
				nextNumbers.clear();
				for (Long N : Numbers)
				{
					Count++;
					if (Count == K)
					{
						System.out.println(N);
						break;
					}
					if (N % 10 != 0 && !previousLunLun.contains(10 * N + N % 10 - 1))
					{
						nextNumbers.add(10 * N + N % 10 - 1);
						previousLunLun.add(10 * N + N % 10 - 1);
					}
					if (!previousLunLun.contains(10 * N + N % 10))
					{
						nextNumbers.add(10 * N + N % 10);
						previousLunLun.add(10 * N + N % 10);
					}
					if (N % 10 != 9 && !previousLunLun.contains(10 * N + N % 10 + 1))
					{
						nextNumbers.add(10 * N + N % 10 + 1);
						previousLunLun.add(10 * N + N % 10 + 1);
					}
				}
				Numbers.clear();
			}
		}
	}
}
