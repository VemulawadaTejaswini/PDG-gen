import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 100000;
	public static final int S_MAX = (int) (Math.ceil(Math.sqrt(MAX)));

	public static class Data implements Comparable<Data>{
		int mul, p, q;

		public Data(int mul, int p, int q) {
			super();
			this.mul = mul;
			this.p = p;
			this.q = q;
		}
		
		public Data(int mul) {
			super();
			this.mul = mul;
		}

		@Override
		public int compareTo(Data arg0) {
			return this.mul - arg0.mul;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + mul;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Data other = (Data) obj;
			if (mul != other.mul)
				return false;
			return true;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		boolean[] is_prime = new boolean[MAX + 1];
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		
		for(int i = 0; i <= S_MAX; i++){
			if(is_prime[i]){
				for(int j = 2 * i; j <= MAX; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		ArrayList<Integer> p_list = new ArrayList<Integer>();
		for(int i = 0; i <= MAX; i++){
			if(is_prime[i]){
				p_list.add(i);
			}
		}
		
		final int size = p_list.size();
		ArrayList<Data> mul_list = new ArrayList<Data>();
		for(int i = 0; i < size; i++){
			for(int j = i; j < size; j++){
				final int p = p_list.get(i);
				final int q = p_list.get(j);
				
				long mul = (long)(p) * (long)(q);
				
				if(mul > 100000L){
					break;
				}
				
				mul_list.add(new Data(p * q, p , q));
			}
		}
		
		Collections.sort(mul_list);
		
		while (true) {
			final int m = sc.nextInt();
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			if(m == 0 && a == 0 && b == 0){
				break;
			}
			
			final double per = a / (double)(b);
			
			int pos = Collections.binarySearch(mul_list, new Data(m));
			if(pos < 0){
				pos = -(pos + 2);
			}
			
			for(int i = pos; i >= 0; i--){
				Data data = mul_list.get(i);
				final double cur = data.p / (double)(data.q);
				//System.out.println(data.p + " " + data.q + " " + cur + " " + per);
				if(per <= cur){
					System.out.println(data.p + " " + data.q);
					break;
				}
			}
		}
	}

}