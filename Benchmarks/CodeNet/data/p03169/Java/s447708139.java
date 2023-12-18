import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int[] num;
	static double[][][] dp;
	static boolean[][][] solved;
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		N = sc.nextInt();
		num = new int[4];
		for(int i = 0; i < N; i++)
			num[sc.nextInt()]++;
		
		dp = new double[num[1]+num[2]+num[3]+1][num[2]+num[3]+1][num[3]+1];
		dp[0][0][0] = 0;
		solved = new boolean[num[1]+num[2]+num[3]+1][num[2]+num[3]+1][num[3]+1];
		solved[0][0][0] = true;
		
		System.out.println(solve(num[1], num[2], num[3]));
		
		/*
		System.out.println();
		for(int i = 0; i <= num[1]; i++){
			System.out.println("[" + i + "]");
			for(int j = 0; j <= num[2]; j++){
				for(int k = 0; k <= num[3]; k++){
					System.out.print("[" + j + "][" + k + "]" + dp[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
	}//end main
	
	public static double solve(int i, int j, int k){
		if(solved[i][j][k]) return dp[i][j][k];
		
		/*
		double res = 0;
		
		if(k >= 1 && j+1 <= num[2]){
			//res += 1.0 * (k+1) * (1 + solve(i, j-1, k+1)) / N;
			res += 1.0 * k * (solve(i, j+1, k-1) + 1) / N;
		}
		
		if(j >= 1 && i+1 <= num[1]){
			//res += 1.0 * (j+1) * (1 + solve(i-1, j+1, k)) / N;
			res += 1.0 * j * (solve(i+1, j-1, k) + 1) / N;
		}
		
		if(i >= 1){
			//res += 1.0 * (i+1) * (1 + solve(i+1, j, k)) / N;
			res += 1.0 * i * (solve(i-1, j, k) + 1) / N;
		}
		
		if(!(i == 0 && j == 0 && k == 0) && !(i == num[1] && j == num[2] && k == num[3])){
			//res = (res + 1.0 * (N-i-j-k) / N) * N / (i+j+k);
			res *= 1.0 * N / (i + j + k);
		}
		
		dp[i][j][k] = res;
		solved[i][j][k] = true;
		return dp[i][j][k];
		*/
		
		double res = 0;
		int s = i + j + k;
		
		if(k >= 1){
			res += (double)solve(i, j+1, k-1) * k / s;
		}
		
		if(j >= 1){
			res += (double)solve(i+1, j-1, k) * j / s;
		}
		
		if(i >= 1){
			res += (double)solve(i-1, j, k) * i / s;
		}
		
		res += (double)N / s;
		
		dp[i][j][k] = res;
		solved[i][j][k] = true;
		return dp[i][j][k];
	}
	
}//end Main

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}
