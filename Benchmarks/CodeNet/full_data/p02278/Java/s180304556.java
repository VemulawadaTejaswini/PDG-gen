import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static class Arr implements Comparable<Arr> {
		int[] array;
		int cost;
		
		public Arr(int[] array, int cost) {
			super();
			this.array = array;
			this.cost = cost;
		}

		public boolean is_finished(){
			for(int i = 1; i < array.length; i++){
				if(array[i - 1] > array[i]){
					return false;
				}
			}
			
			return true;
		}
		
		@Override
		public int compareTo(Arr arg0) {
			return this.cost - arg0.cost;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(array);
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
			Arr other = (Arr) obj;
			if (!Arrays.equals(array, other.array))
				return false;
			return true;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	
		final int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		
		PriorityQueue<Arr> queue = new PriorityQueue<Arr>();
		HashSet<Arr> visited = new HashSet<Arr>();
		queue.add(new Arr(array, 0));
		
		while(!queue.isEmpty()){
			final Arr arr = queue.poll();
			
			if(arr.is_finished()){
				System.out.println(arr.cost);
				break;
			}
			
			if(visited.contains(arr)){
				continue;
			}else{
				visited.add(arr);
			}
			
			for(int i = 0; i < arr.array.length; i++){
				for(int j = i + 1; j < arr.array.length; j++){
					int[] next = new int[arr.array.length];
					System.arraycopy(arr.array, 0, next, 0, arr.array.length);
					int tmp = next[i];
					next[i] = next[j];
					next[j] = tmp;
					
					Arr next_arr = new Arr(next, arr.cost + next[i] + next[j]);
					
					if(!visited.contains(next_arr)){
						queue.add(next_arr);
					}
				}
			}
			
		}
		
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}