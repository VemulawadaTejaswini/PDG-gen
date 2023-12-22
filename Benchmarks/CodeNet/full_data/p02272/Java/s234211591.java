import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int cnt = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String[] t = br.readLine().split(" ");
		int[] s = new int[n];
		for(int i = 0; i < n; ++i){
			s[i] = Integer.parseInt(t[i]);
		}
		mergeSort(s, 0, n);
		
		StringBuilder sb = new StringBuilder();
		sb.append(s[0]);
		for(int i = 1; i < n; ++i) {
			sb.append(" " + s[i]);
		}
		System.out.println(sb);
		System.out.println(cnt);
	}
	public static void mergeSort(int[] s, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(s, left, mid);
			mergeSort(s, mid, right);
			merge(s, left, mid, right);
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
			cnt += 1;
			if(s1[i] <= s2[j]){
				s[k] = s1[i];
				i += 1;
			}else{
				s[k] = s2[j];
				j += 1;
			}
		}
		
	}
	
}