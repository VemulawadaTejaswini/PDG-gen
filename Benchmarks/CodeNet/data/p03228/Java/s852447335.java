import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int[] array = new int[2];
		for(int i= 0; i < 2; i++)
			array[i] = sc.nextInt();
		int c = sc.nextInt();

		for(int i = 0; i < c; i++) {
			int num = i % 2;
			if(array[num] % 2 != 0)
				array[num]--;
			array[num] /=2;
			array[(num+1) % 2] += array[num];
		}
		System.out.println(array[0] + " " + array[1]);
	}
}

class Scanner {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final int SPACE = (int)' ';
	private static final int LINE_END_0 = 13;
	private static final int LINE_END_1 = 10;
	private static final int BEFORE = -1;
	
	public boolean ready() {
		try {
			return br.ready();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
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
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public long nextLong() {
		return Long.parseLong(next());
	}
}
