import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static long cnt = 0;
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("./ALDS1_5_D-in19.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//long start = System.nanoTime();
		
		String[] t = br.readLine().split(" ");
		int[] s = new int[n];
		for(int i = 0; i < n; ++i){
			s[i] = Integer.parseInt(t[i]);
		}
		//int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		//System.out.println((System.nanoTime() - start)/1000/1000 + "ms");
		
		mergeSort(s, 0, n);

		System.out.println(cnt);
	}
	public static void printArray(int[] s){
		for(int i = 0; i < s.length; ++i) {
			System.out.print(" " + s[i]);
		}
		System.out.println(": " + cnt);
	}
	public static void mergeSort(int[] s, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(s, left, mid);
			mergeSort(s, mid, right);
			merge(s, left, mid, right);
			//printArray(s);
		}
	}
	public static void merge(int[] s, int left, int mid, int right) {
		int[] s1 = Arrays.copyOfRange(s, left, mid + 1);
		int[] s2 = Arrays.copyOfRange(s, mid, right + 1);
		
		s1[mid - left] = Integer.MAX_VALUE;
		s2[right - mid] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for(int k = left; k < right; ++k) {
			if(s1[i] <= s2[j]){
				s[k] = s1[i];
				if(k < left + i){
					cnt += left + i - k;
				}
				i += 1;
				
			}else{
				s[k] = s2[j];
				if(k < mid + j){
					cnt += mid + j - k;
				}
				j += 1;
				
			}
		}
		
	}
	
}