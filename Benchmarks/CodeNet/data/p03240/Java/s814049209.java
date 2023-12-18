
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int[][] table = new int[n][3];
		int[][] predicateTable = new int[n][3];
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			int[][] t = h == 0 ? table : predicateTable;
			t[i][0] = x;
			t[i][1] = y;
			t[i][2] = h;
		}
		List<Integer> cx = new ArrayList<>();
		List<Integer> cy = new ArrayList<>();
		for(int i = 1; i <= 100; i++) {
			cx.add(i);
			cy.add(i);
		}
		for(int i = 0; i< 100; i++) {
			for(int j = 0; j < 100; j++) {
				int h = calc(table[0], i , j);
				boolean isOK = true;
				for(int l = 0; l < n; l++) {
					if(h == calc(table[l], i, j))
						continue;
					isOK = false;
					break;
				}
				if(!isOK)
					continue;
				
				for(int l =0; l < n; l++) {
					int max = calc(predicateTable[l], i, j);
					if(h <= max)
						continue;
					isOK = false;
					break;
				}
				if(isOK) {
					System.out.println(i + " " + j + " " + h);
					return;
				}
			}
		}
	}
	
	public static int calc(int[] array, int cx, int cy) {
		int x = array[0];
		int y = array[1]; 
		int h = array[2];
		if(h == 0) 
			return(int)( Math.abs(x - cx) + Math.abs(y - cy));
		else 
			return h + Math.abs(x - cx) + Math.abs(y - cy);
	}
}

class Scanner {
	private static final int SPACE = (int)' ';
	private static final int LINE_END_0 = 13;
	private static final int LINE_END_1 = 10;
	private static final int BEFORE = -1;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String next(){
		StringBuilder sb = new StringBuilder();
		
		int length = BEFORE;
		readLoop: while(true) {
			try {
				int value = br.read();
				switch(value) {
				case LINE_END_1:
					if(length == BEFORE)
						break;
					
					if((int)sb.charAt(length) == LINE_END_0)
						sb.deleteCharAt(length);
				case SPACE:
					break readLoop;
				}
				sb.append((char)value);
				length++;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	public String[] nextArray(int length) {
		String[] array = new String[length];
		for(int i = 0; i < length; i++)
			array[i] = next();
		return array;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public double[] nextDoubleArray(int length) {
		double[] array = new double[length];
		for(int i = 0; i < length; i++)
			array[i] = nextDouble();
		return array;
	}
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public int[] nextIntArray(int length) {
		int[] array = new int[length];
		for(int i = 0; i < length; i++)
			array[i] = nextInt();
		return array;
	}
	
	public long nextLong() {
		return Long.parseLong(next());
	}
	
	public long[] nextLongArray(int length) {
		long[] array = new long[length];
		for(int i = 0; i < length; i++)
			array[i] = nextLong();
		return array;
	}
	
	public boolean ready() {
		try {
			return br.ready();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
