import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();

		(new Solve(scan.readLine().split(" "))).solve();
	}
}
class Solve {
	private final String[] tokens;

	public Solve(String[] tokens)
	{
		this.tokens = tokens;
	}

	public void solve()
	{
		Token[] compiledTokens = new Token[tokens.length];

		for(int i=0, l=tokens.length; i < l; i++)
		{
			String token = tokens[i];

			if(token.equals("+"))
			{
				compiledTokens[i] = new AddOperator();
			}
			else if(token.equals("-"))
			{
				compiledTokens[i] = new SubtractOperator();
			}
			else if(token.equals("*"))
			{
				compiledTokens[i] = new MultiplyOperator();
			}
			else if(token.equals("/"))
			{
				compiledTokens[i] = new DivideOperator();
			}
			else
			{
				compiledTokens[i] = new OperandToken(Integer.parseInt(token));
			}
		}
		Token[] stack = new Token[100];

		int stackTop = -1;

		for(Token t: compiledTokens)
		{
			if(t instanceof IOperator)
			{
				OperandToken b = (OperandToken)stack[stackTop--];
				OperandToken a = (OperandToken)stack[stackTop--];

				stack[++stackTop] = new OperandToken(((IOperator)t).apply(a, b));
			}
			else
			{
				stack[++stackTop] = t;
			}
		}

		System.out.println(((OperandToken)stack[stackTop]).value());
	}
}
abstract class Token {

}
class OperandToken extends Token {
	private final int operand;

	public OperandToken(int v)
	{
		operand = v;
	}

	public int value()
	{
		return operand;
	}
}
interface IOperator {
	public int apply(OperandToken a, OperandToken b);
}
abstract class OperatorToken extends Token implements IOperator {
}
class AddOperator extends OperatorToken {
	public int apply(OperandToken a, OperandToken b)
	{
		return a.value() + b.value();
	}
}
class SubtractOperator extends OperatorToken {
	public int apply(OperandToken a, OperandToken b)
	{
		return a.value() - b.value();
	}
}
class MultiplyOperator extends OperatorToken {
	public int apply(OperandToken a, OperandToken b)
	{
		return a.value() * b.value();
	}
}
class DivideOperator extends OperatorToken {
	public int apply(OperandToken a, OperandToken b)
	{
		return a.value() / b.value();
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