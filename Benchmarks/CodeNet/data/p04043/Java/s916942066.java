/* Template */

/*
 * Contest: ABC042
 * Author : shu
 * Date   : 2016/11/18
 */
 
/* Import */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
 
public class Main {
	public static final int A = 1;
	public static final int B = 2;
	public static final int C = 3;
	public static final int D = 4;
	public static final int E = 5;
	public static final int F = 6;
 
	//=======================================//
	//=======================================//
	public static final int PROBREM_NUMBER = A;
	//=======================================//
	//=======================================//
 
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		Problem probrem = new Problem();
		probrem.solve(PROBREM_NUMBER, in, out);
		out.close();
	}
}
 
class Problem {
	public void solve(int probremNumber, InputReader in, OutputWriter out) {
		switch (probremNumber) {
		case Main.A:
			A(in, out);
			break;
		case Main.B:
			B(in, out);
			break;
		case Main.C:
			C(in, out);
			break;
		case Main.D:
			D(in, out);
			break;
		case Main.E:
			E(in, out);
			break;
		case Main.F:
			F(in, out);
			break;
		default:
			out.print("PROBREM SELECTION ERROR");
		}
	}
 
	public void A(InputReader in, OutputWriter out) {
		int check=0;
		int nums[] = new int[3];
		nums[0] = in.nextInt();
		nums[1] = in.nextInt();
		nums[2] = in.nextInt();
		
		for (int num: nums) {
			if (num == 5) check += 5;
			if (num == 7) check += 7;
		}
		
		if (check==17) {
			out.printLine("YES");
		} else {
			out.printLine("NO");
		}
	}
 
	public void B(InputReader in, OutputWriter out) {
		int n = in.nextInt();
		int l = in.nextInt();
		String[] strings = new String[n];
		String str = "";
		for (int i=0; i<n; i++) strings[i] = in.next();
		Arrays.sort(strings);
		for (String string: strings) {
			str += string;
		}
		out.printLine(str);
	}
 
	public void C(InputReader in, OutputWriter out) {
		
	}
 
	public void D(InputReader in, OutputWriter out) {
 
	}
 
	public void E(InputReader in, OutputWriter out) {
 
	}
 
	public void F(InputReader in, OutputWriter out) {
 
	}
}
 
 
class InputReader {
    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;
 
    public InputReader(InputStream stream) {
        this.stream = stream;
    }
 
    public static boolean isSpace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 
    public int read() {
        if (count == -1) {
            throw new InputMismatchException();
        }
        try {
            if (cur >= count) {
                cur = 0;
                count = stream.read(buffer);
                if (count <= 0)
                    return -1;
            }
        } catch (IOException e) {
            throw new InputMismatchException();
        }
        return buffer[cur++];
    }
 
    public int readSkipSpace() {
        int c;
        do {
            c = read();
        } while (isSpace(c));
        return c;
    }
 
    public int nextInt() {
        int sgn = 1;
        int c = readSkipSpace();
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res = res * 10 + c - '0';
            c = read();
        } while (!isSpace(c));
        res *= sgn;
        return res;
    }
 
    public String next() {
		int c;
		String s = "";
		while (isSpace((c=read())))
			;
		while (!isSpace(c)) {
			s += Character.toString((char) c);
			c = read();
		}
		return s;
	}
}
 
class OutputWriter {
    private final PrintWriter writer;
 
    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }
 
    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }
 
    public void printLine(Object... objects) {
        print(objects);
        writer.println();
    }
 
    public void close() {
        writer.close();
    }
}