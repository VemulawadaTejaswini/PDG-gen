import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] S = new int[n];
		for(int i = 0; i < n; i++){
			S[i] = Integer.parseInt(str[i]);
		}
		
		int q = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		int count = 0;
		for(int i = 0; i < q; i++){
			
			int T = Integer.parseInt(str[i]);
			int left = 0, right = n;
			
			while(right != left){
				int half = (right + left)/2;
				if(S[half] < T){
					left = half + 1;
				} else if(S[half] > T){
					right = half;
				} else {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
