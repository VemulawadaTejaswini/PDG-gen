import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		FastScannerC sc = new FastScannerC(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[] arr = new int[26];
		for(int i = 0; i<H; i++){
			String line = sc.next();
			for(int j = 0; j<W; j++){
				char c = line.charAt(j);
				arr[c - 'a']++;
			}
		}
		
		int ones = -1;
		int twos = -1;
		int fours = -1;
		
		if(H % 2 == 0 && W % 2 == 0){
			fours = H * W / 4;
			twos = 0;
			ones = 0;
		}
		else if(H % 2 == 0){
			fours = H * (W-1) / 4;
			twos = H / 2;
			ones = 0;
		}
		else if(W % 2 == 0){
			fours = (H-1) * W / 4;
			twos = W / 2;
			ones = 0;
		}
		else{
			fours = (H-1) * (W-1) / 4;
			twos = (H + W - 2) / 2;
			ones = 1;	
		}
		
		
		//fours
		for(int i = 0; i<26;){
			if(fours == 0) break;
			
			if(arr[i] >= 4){
				arr[i] -= 4;
				fours--;
			}
			else{
				i++;
			}
		}
		
		//twos
		for(int i = 0; i<26;){
			if(twos == 0) break;
			
			if(arr[i] >= 2){
				arr[i] -= 2;
				twos--;
			}
			else{
				i++;
			}
		}
		
		//ones
		for(int i = 0; i<26;){
			if(ones == 0) break;
			
			if(arr[i] >= 1){
				arr[i] -= 1;
				ones--;
			}
			else{
				i++;
			}
		}
		
		int sum = ones + twos + fours;
		if(sum > 0) System.out.println("No");
		else System.out.println("Yes");
	}
}

class FastScannerC{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public FastScannerC(InputStream stream)
    {
        this.stream = stream;
    }

    public int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars)
        {
            curChar = 0;
            try
            {
                numChars = stream.read(buf);
            } catch (IOException e)
            {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public int nextInt()
    {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-')
        {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do
        {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public String next()
    {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do
        {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }  

    public double nextDouble() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        double res = 0;
        while (!isSpaceChar(c) && c != '.') {
            if (c == 'e' || c == 'E')
                return res * Math.pow(10, nextInt());
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        }
        if (c == '.') {
            c = read();
            double m = 1;
            while (!isSpaceChar(c)) {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                m /= 10;
                res += (c - '0') * m;
                c = read();
            }
        }
        return res * sgn;
    }
    
    public long nextLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
    
    public boolean isSpaceChar(int c)
    {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
    
    public boolean isLineEndChar(int c)
    {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == '\n' || c == '\r' || c == -1;
    }

    public interface SpaceCharFilter
    {
        public boolean isSpaceChar(int ch);
    }
}