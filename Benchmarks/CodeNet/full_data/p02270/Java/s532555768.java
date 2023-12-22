import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int[] w = new int[n];
		
		for(int i = 0; i < n; i++){
			w[i] = Integer.parseInt(br.readLine());
		}
		
		boolean flug = true;
		for(int P = 0; flug; P++){
			
			int[] track = new int[k];
			Arrays.fill(track, 0);
			
			for(int i = 0, j = 0; i < n && j < k; ){//(i, j) = (w, track).
				if(track[j] + w[i] > P){
					j++;
				} else {
					track[j] += w[i];
					j = 0;
					if(++i == n) {
						System.out.println(P);
						flug = false;
					}
				}
			}
		}
	}
}
