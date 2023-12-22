import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ContestScanner scan = new ContestScanner();

		final int m = scan.nextInt();
		final ICommand[] commands = new ICommand[m];

		for(int i=0; i < m; i++)
		{
			final String c = scan.next();

			if(c.equals("insert"))
			{
				commands[i] = new InsertCommand(scan.nextLong());
			}
			else if(c.equals("find"))
			{
				commands[i] = new FindCommand(scan.nextLong());
			}
			else if(c.equals("print"))
			{
				commands[i] = new PrintCommand();
			}
			else
			{
				throw new RuntimeException("invalid command!");
			}
		}

		(new Solve(m, commands)).solve();
	}
}
class Solve {
	private long m;
	private ICommand[] commands;

	public Solve(final long m, final ICommand[] commands)
	{
		this.m = m;
		this.commands = commands;
	}

	public void solve()
	{
		Tree T = new Tree();

		for(ICommand command: commands)
		{
			command.exec(T);
		}
	}
}
class Tree {
	public Node root;

	public Tree()
	{
		root = null;
	}
}
class Node {
	public final long key;
	public Node p;
	public Node l;
	public Node r;

	public Node(final long key)
	{
		this.key = key;
		this.p = null;
		this.l = null;
		this.r = null;
	}
}
interface ICommand {
	public void exec(Tree T);
}
class InsertCommand implements ICommand {
	private final long key;

	public InsertCommand(long key)
	{
		this.key = key;
	}

	public void exec(Tree T)
	{
		Node z = new Node(key);
		Node y = null;
		Node x = T.root;

		while(x != null)
		{
			y = x;
			if(z.key < x.key)
				x = x.l;
			else
				x = x.r;
		}

		z.p = y;

		if(T.root == null)
			T.root = z;
		else if(z.key < y.key)
			y.l = z;
		else
			y.r = z;
	}
}
class PrintCommand implements ICommand {
	public void exec(Tree T)
	{
		StringBuilder sb = new StringBuilder();

		walkInorder(T.root, sb);
		System.out.println(sb.toString());
		sb = new StringBuilder();
		walkPreorder(T.root, sb);
		System.out.println(sb.toString());
	}

	private void walkPreorder(Node node, final StringBuilder sb)
	{
		sb.append(" " + node.key);
		if(node.l != null) walkPreorder(node.l, sb);
		if(node.r != null) walkPreorder(node.r, sb);
	}

	private void walkInorder(final Node node, final StringBuilder sb)
	{
		if(node.l != null) walkInorder(node.l, sb);
		sb.append(" " + node.key);
		if(node.r != null) walkInorder(node.r, sb);
	}
}
class FindCommand implements ICommand {
	private final long key;

	public FindCommand(final long key)
	{
		this.key = key;
	}

	public void exec(Tree T)
	{
		Node x = T.root;

		while(x != null)
		{
			if(x.key == key) break;
			else if(x.key < key) x = x.r;
			else x = x.l;
		}

		if(x == null) System.out.println("no");
		else System.out.println("yes");
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

	public static interface ICreator<T> {
		public T createFromToken(final ContestScanner scanner) throws IOException;
	}

	public static interface IArrayInitializer {
		public void initialize(final ContestScanner scanner, final int i) throws IOException;
	}

	public static interface IObjectInitializer<T> {
		public T initialValue(final ContestScanner scanner);
	}

	public static class ObjectArrayInitializer<T> implements IArrayInitializer {
		protected T[] arr;
		protected final IObjectInitializer<T> initializer;

		private ObjectArrayInitializer(T[] arr, final IObjectInitializer<T> initializer)
		{
			this.arr = arr;
			this.initializer = initializer;
		}

		public static <T> ObjectArrayInitializer<T> create(T[] arr, final IObjectInitializer<T> initializer)
		{
			return new ObjectArrayInitializer<T>(arr, initializer);
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = initializer.initialValue(scanner);
		}

		public T[] getArray()
		{
			return this.arr;
		}
	}


	public static class ByteArrayInitializer implements IArrayInitializer {
		protected byte[] arr;

		private ByteArrayInitializer(final int n)
		{
			this.arr = new byte[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextByte();
		}

		public byte[] getArray()
		{
			return this.arr;
		}
	}

	public static class ShortArrayInitializer implements IArrayInitializer {
		protected short[] arr;

		private ShortArrayInitializer(final int n)
		{
			this.arr = new short[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextShort();
		}

		public short[] getArray()
		{
			return this.arr;
		}
	}

	public static class IntArrayInitializer implements IArrayInitializer {
		protected int[] arr;

		private IntArrayInitializer(final int n)
		{
			this.arr = new int[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextInt();
		}

		public int[] getArray()
		{
			return this.arr;
		}
	}

	public static class LongArrayInitializer implements IArrayInitializer {
		protected long[] arr;

		private LongArrayInitializer(final int n)
		{
			this.arr = new long[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextLong();
		}

		public long[] getArray()
		{
			return this.arr;
		}
	}

	public static class FloatArrayInitializer implements IArrayInitializer {
		protected float[] arr;

		private FloatArrayInitializer(final int n)
		{
			this.arr = new float[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextFloat();
		}

		public float[] getArray()
		{
			return this.arr;
		}
	}

	public static class DoubleArrayInitializer implements IArrayInitializer {
		protected double[] arr;

		private DoubleArrayInitializer(final int n)
		{
			this.arr = new double[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextDouble();
		}

		public double[] getArray()
		{
			return this.arr;
		}
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

	public byte nextByte() throws IOException, NumberFormatException {
		return Byte.parseByte(nextToken());
	}

	public short nextShort() throws IOException, NumberFormatException {
		return Short.parseShort(nextToken());
	}

	public int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws IOException, NumberFormatException {
		return Long.parseLong(nextToken());
	}

	public float nextFloat() throws IOException, NumberFormatException {
		return Float.parseFloat(nextToken());
	}

	public double nextDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(nextToken());
	}

	public <T> T nextObject(final ICreator<T> creator) throws IOException, NumberFormatException {
		return creator.createFromToken(this);
	}

	public int[] nextIntArray(final int N) throws IOException, NumberFormatException {
		int[] result = new int[N];

		for(int i=0; i < N; i++) result[i] = nextInt();

		return result;
	}

	public long[] nextLongArray(final int N) throws IOException, NumberFormatException {
		long[] result = new long[N];

		for(int i=0; i < N; i++) result[i] = nextLong();

		return result;
	}

	public float[] nexFloatArray(final int N) throws IOException, NumberFormatException {
		float[] result = new float[N];

		for(int i=0; i < N; i++) result[i] = nextFloat();

		return result;
	}

	public double[] nexDoubleArray(final int N) throws IOException, NumberFormatException {
		double[] result = new double[N];

		for(int i=0; i < N; i++) result[i] = nextDouble();

		return result;
	}

	public <T> T[] nextObjectArray(T[] result, final ICreator<T> creator) throws IOException, NumberFormatException {
		for(int i=0, N=result.length; i < N; i++) result[i] = nextObject(creator);

		return result;
	}

	public <T> ArrayList<T> nextGenericObjectArrayList(final int N, final ICreator<T> creator) throws IOException, NumberFormatException {
		ArrayList<T> result = new ArrayList<T>();
		for(int i=0; i < N; i++) result.add(nextObject(creator));

		return result;
	}

	public void nextTable(final int N, IArrayInitializer... arrayInitializers) throws IOException, NumberFormatException {
		for(int i=0; i < N; i++) for(IArrayInitializer initializer: arrayInitializers)
		{
			initializer.initialize(this, i);
		}
	}
}