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
		
		int max_t = 0;
		for(Icicle ice : icicles){
			final int left_len = ice.pos - 1 < 0 ? 0 : array[ice.pos - 1];
			final int right_len = ice.pos + 1 >= N ? 0 : array[ice.pos + 1];
			final int max = Math.max(left_len, right_len);
			
			if(max < ice.len){
				time[ice.pos] = L - ice.len;
			}else if(ice.len < left_len && ice.len < right_len){
				if(left_len < right_len){
					time[ice.pos] = (L - ice.len) + time[ice.pos - 1];
				}else{
					time[ice.pos] = (L - ice.len) + time[ice.pos + 1];
				}
			}else if(ice.len < left_len){
				time[ice.pos] = (L - ice.len) + time[ice.pos - 1];
			}else if(ice.len < right_len){
				time[ice.pos] = (L - ice.len) + time[ice.pos + 1];
			}
			
			max_t = Math.max(max_t, time[ice.pos]);
		}
		
		System.out.println(max_t);
	}

}