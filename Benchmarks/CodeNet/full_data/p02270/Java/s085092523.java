import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = t[0];
		int k = t[1]; // max no of dump truck
		int[] w = new int[n];
		int max = 0;
		for(int i = 0; i < n; ++i) {
			w[i] = Integer.parseInt(br.readLine());
			if(max < w[i]){
				max = w[i];
			}
		}
		
		for(int p = max; ; ++p) {
			int l = 1;// number of dump truck
			int s = p;
			for(int i = 0; i < n && l <= k; ++i) {
				s -= w[i];
				//System.out.println(w[i] + " " + s);
				if(s < 0){
					l += 1;
					s = p - w[i];
				}
			}
			if(l <= k){
				System.out.println(p);
				break;
			}
		}

	}

}