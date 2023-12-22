import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./ALDS1_4_B-in1.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String[] l = br.readLine().split(" ");
		int[] s = new int[n];
		for(int i = 0; i < n; ++i) {
			s[i] = Integer.parseInt(l[i]);
		}
		
		int q = Integer.parseInt(br.readLine());
		//int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		l = br.readLine().split(" ");
		int[] t = new int[q];
		for(int i = 0; i < q; ++i) {
			t[i] = Integer.parseInt(l[i]);
		}
		
		//long start = System.nanoTime();
		int cnt = 0;
		for(int i = 0; i < q; ++i) {
			if(binarySearch(t[i], s)){
				cnt += 1;
			}
		}
		System.out.println(cnt);
		//System.out.println("Time:" + (System.nanoTime() - start) / 1000000f + " ms");

	}
	public static boolean binarySearch(int t, int[] s){
		int l = 0;
		int r = s.length;
		while(l <= r) {
			int mid = (l + r) / 2;
			if(s[mid] == t) {
				return true;
			}else if(s[mid] < t){
				l = mid + 1;
			}else{
				r = mid - 1;
			}
		}
		return false;
	}

}