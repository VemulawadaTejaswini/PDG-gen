import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		
		for(int tt = 0; tt < N; tt++){
			long[] array = new long[8];
			
			for(int i = 0; i < 8; i++){
				array[i] = sc.nextLong(16);
			}
			
			final long def = sc.nextLong(16);
			
			int[] cal = new int[33];
			int[] det = new int[33];
			
			long ans = 0;
			for(int i = 0; i < 32; i++){
				det[i] += cal[i] % 2;
				for(int t = 0; t < 8; t++){
					det[i] += (((array[t] & ((1L << (i + 1)) - 1))) >> i) % 2;
				}
				det[i] += (((def & ((1L << (i + 1)) - 1))) >> i) % 2;
				
				boolean k = det[i] % 2 == 1;
				if(cal[i] % 2 != 0){
					//k =! k;
				}
				if(k){
					ans |= (1L << i);
				}
				
				int sum = 0;
				sum += cal[i];
				for(int t = 0; t < 8; t++){
					sum += ((k ? 1 : 0) + (((array[t] & ((1L << (i + 1)) - 1))) >> i)) % 2;
				}
				cal[i+1] = sum / 2;
			}
			
			//System.out.println(Arrays.toString(cal));
			//System.out.println(Arrays.toString(det));
			System.out.println(Long.toHexString(ans));
			
		}
	}

}