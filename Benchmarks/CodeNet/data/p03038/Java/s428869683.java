
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
		Set<Integer> inputs = new HashSet<>();
		Map<Integer, Integer> countMap = new HashMap<>();
		for(int i = 0;i < n; i++){
			int a = sc.nextInt();
			inputs.add(a);
			increaseMap(countMap, a);
		}
		List<Integer> numbers = inputs.stream().collect(Collectors.toList());
		Collections.sort(numbers);

		for(int i = 0; i < m; i++){
			int b = sc.nextInt();
			int c = sc.nextInt();
			change(numbers, countMap, b, c);
		}
//		System.out.println(countMap);
		long sum = countMap.entrySet().stream().mapToLong(entry -> (long)entry.getKey() * (long)entry.getValue()).sum();
		System.out.println(sum);
	}

	private static void increaseMap(Map<Integer, Integer> map, int key){
		if(map.containsKey(key))
			map.put(key, map.get(key) + 1);
		else
			map.put(key, 1);
	}

	private static void change(List<Integer> numbers, Map<Integer, Integer> counts, int b, int c){

		Set<Integer> removed = new HashSet<>();
		boolean isChanged = false;
		for(int i =0; i < numbers.size(); i++){
//			System.out.println("begin b=" + b +", c = " + c);
//			System.out.println(numbers);
//			System.out.println(counts);
			int number = numbers.get(i);
			if(c < number)
				break;
			isChanged |= true;

			int count = counts.get(number);
			if(b < count) {
				counts.put(number, count - b);
				if(counts.containsKey(c))
					b += counts.get(c);
				counts.put(c, b);
				b = 0;
			}else {
				if (counts.containsKey(c))
					counts.put(c, counts.get(c) + count);
				else
					counts.put(c, count);
				b -= count;
				counts.remove(number);
				removed.add(number);
			}
//			System.out.println(numbers);
//			System.out.println(counts);
//			System.out.println(removed);
//			System.out.println("end");
		}
		numbers.removeAll(removed);
		if(!numbers.contains(c) && isChanged) {
			numbers.add(0, c);
			Collections.sort(numbers);
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
