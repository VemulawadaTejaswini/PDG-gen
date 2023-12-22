import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static class Icicle implements Comparable<Icicle>{
		int len;
		int pos;
		
		public Icicle(int len, int pos) {
			super();
			this.len = len;
			this.pos = pos;
		}

		@Override
		public int compareTo(Icicle arg0) {
			return arg0.len - this.len;
		}

		@Override
		public String toString() {
			return "Icicle [len=" + len + ", pos=" + pos + "]";
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int L = sc.nextInt();
		
		int[] array = new int[N];
		for(int i = 0; i < N; i++){
			array[i] = sc.nextInt();
		}
		
		int[] time = new int[N];
		
		Icicle[] icicles = new Icicle[N];
		for(int i = 0; i < N; i++){
			icicles[i] = new Icicle(array[i], i);
		}
		
		Arrays.sort(icicles);
		
		//System.out.println(Arrays.deepToString(icicles));
		
		int max_t = 0;
		for(Icicle ice : icicles){
			int pre_time = 0;
			
			if(ice.pos > 0 && pre_time < time[ice.pos - 1]){
				pre_time = time[ice.pos - 1];
			}
			if(ice.pos < N - 1 && pre_time < time[ice.pos + 1]){
				pre_time = time[ice.pos + 1];
			}
			
			time[ice.pos] = L - ice.len + pre_time;
			
			max_t = Math.max(max_t, time[ice.pos]);
		}
		
		System.out.println(max_t);
	}

}