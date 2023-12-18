
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] table = new int[m][2];
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0;i < m; i++){
			int p = sc.nextInt();
			int y = sc.nextInt();
			table[i][0] = p;
			table[i][1] = y;
			List<Integer> l = new ArrayList<>();
			if(map.containsKey(p))
				l = map.get(p);
			l.add(y);
			map.put(p, l);
		}
		for(int i =0;i < n; i++){
			if(map.containsKey(i))
				Collections.sort(map.get(i));
		}

		for(int i=0; i < m; i++){
			if(!map.containsKey(i))
				continue;
			String format = "%06d";
			int p = table[i][0];
			int y = table[i][1];
			String id = String.format(format, p) + String.format(format, map.get(p).indexOf(y)+1);
			System.out.println(id);
		}



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
