import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();
		int N = scan.nextInt();
		Card[] C = new Card[N];

		for(int i=0; i < N; i++)
		{
			C[i] = new Card(scan.next());
		}

		(new Solve(N, C)).solve();
	}
}

class Card implements Cloneable {
	public final char mark;
	public final int value;

	public Card(String card)
	{
		mark = card.charAt(0);
		value = (int)(card.charAt(1) - '0');
	}

	public boolean equals(Card c)
	{
		return this.mark == c.mark && this.value == c.value;
	}

	@Override
	public Card clone()
	{
		Card c = null;

		try {
			c = (Card)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return c;
	}

	@Override
	public String toString()
	{
		return String.format("%c", mark) + ((Integer)value).toString();
	}
}
class Solve {
	private final int N;
	private final Card[] C;

	public Solve(final int N, final Card[] C)
	{
		this.N = N;
		this.C = C;
	}

	public void solve()
	{
		Card[] sortedBubble = bubblesort(N, C);
		Card[] sortedSelection = selectionsort(N, C);

		printCards(sortedBubble);
		System.out.println("Stable");
		printCards(sortedSelection);
		System.out.println((compareSorted(sortedBubble, sortedSelection) ? "Stable" : "Not stable"));
	}

	public void printCards(final Card[] C)
	{
		for(int i=0; i < N; i++)
		{
			if(i > 0) System.out.print(" ");
			System.out.print(C[i]);
		}

		System.out.println("");

	}
	public boolean compareSorted(Card[] a, Card[] b)
	{
		if(a.length != b.length) return false;

		for(int i=0, l=a.length; i < l; i++)
		{
			if(!a[i].equals(b[i])) return false;
		}

		return true;
	}
	public Card[] bubblesort(final int N, final Card[] C)
	{
		Card[] sorted = new Card[N];

		for(int i=0; i < N; i++) sorted[i] = C[i].clone();

		for(int i=0; i < N; i++) for(int j=N-1; j > i; j--)
		{
			if(sorted[j].value < sorted[j-1].value)
			{
				Card c = sorted[j];
				sorted[j] = sorted[j-1];
				sorted[j-1] = c;
			}
		}

		return sorted;
	}

	public Card[] selectionsort(final int N, final Card[] C)
	{
		Card[] sorted = new Card[N];

		for(int i=0; i < N; i++) sorted[i] = C[i].clone();

		for(int i=0, minj=0; i < N; i++)
		{
			minj = i;

			for(int j=i; j < N; j++)
			{
				if(sorted[j].value < sorted[minj].value)
				{
					minj = j;
				}
			}

			if(i != minj)
			{
				Card c = sorted[i];
				sorted[i] = sorted[minj];
				sorted[minj] = c;
			}
		}

		return sorted;
	}
}
class ContestScanner {
	BufferedReader reader;
	String[] line;
	int index;
	public ContestScanner() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public ContestScanner(String filename) throws FileNotFoundException {
		reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	}

	public String nextToken() throws IOException {
		if(line == null || index >= line.length)
		{
			line = reader.readLine().trim().split(" ");
			index = 0;
		}

		return line[index++];
	}

	public String next() throws IOException {
		return nextToken();
	}

	public String readLine() throws IOException {
		line = null;
		index = 0;

		return reader.readLine();
	}

	public int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws IOException, NumberFormatException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(nextToken());
	}

	public int[] nextIntArray(int N) throws IOException, NumberFormatException {
		int[] result = new int[N];

		for(int i=0; i < N; i++) result[i] = nextInt();

		return result;
	}

	public long[] nextLongArray(int N) throws IOException, NumberFormatException {
		long[] result = new long[N];

		for(int i=0; i < N; i++) result[i] = nextLong();

		return result;
	}

	public double[] nexDoubleArray(int N) throws IOException, NumberFormatException {
		double[] result = new double[N];

		for(int i=0; i < N; i++) result[i] = nextDouble();

		return result;
	}
}