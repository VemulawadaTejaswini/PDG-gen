import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		long[] a = sc.nextLongArray(n);
		Arrays.sort(a);
		Deque<Long> aDeque = new ArrayDeque<>();
		for(long i : a)
			aDeque.add(i);
		long sum = calc(new ArrayDeque<>(aDeque));
		aDeque = new ArrayDeque<>(aDeque.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		System.out.println(Math.max(sum, calc(aDeque)));
	}
	
	private static long calc(Deque<Long> aDeque) {
		Deque<Long> deque = new ArrayDeque<>();
		deque.add(aDeque.pollFirst());
		while(!aDeque.isEmpty()) {
			deque.addLast(aDeque.pollLast());
			if(!aDeque.isEmpty())
				deque.addFirst(aDeque.pollLast());
			if(!aDeque.isEmpty())
				deque.addLast(aDeque.pollFirst());
			if(!aDeque.isEmpty())
				deque.addFirst(aDeque.pollFirst());
		}
		long start = deque.poll();
		long sum = 0;
		while(!deque.isEmpty()) {
			long i = deque.poll();
			sum += Math.abs(start - i);
			start = i;
		}
		return sum;
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
