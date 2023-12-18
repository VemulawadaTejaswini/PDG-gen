
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int digit = String.valueOf(n).length();

		int sum = 0;

		sum += calc(n, 0, digit, true).size();

		System.out.println(sum);

	}

	public static Set<Long> calc(long n, long v, int digit, boolean isTop){
		long value = (long)Math.pow(10, digit);
		long sum = 0;
		Set<Long> resultSet = new HashSet<>();

		if(digit < 0){
			if(v >n)
				return new HashSet<>();
			Set<Character> set = new HashSet<>();
			for(char c : String.valueOf(v).toCharArray())
				set.add(Character.valueOf(c));
			if(set.size() == 3) {
				resultSet.add(v);
				return resultSet;
			}else
				return new HashSet<>();
		}

		if(isTop)
			resultSet.addAll(calc(n, 0, digit-1, true));

		resultSet.addAll(calc(n, v + value * 3, digit-1, false));
		resultSet.addAll(calc(n, v + value * 5, digit-1, false));
		resultSet.addAll(calc(n, v + value * 7, digit-1, false));

		return resultSet;
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
