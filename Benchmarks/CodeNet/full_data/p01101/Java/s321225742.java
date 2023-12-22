import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);

			if(n == 0 && m == 0){
				break;
			}

			int sum = -1;
			int x1, x2;

			tmpArray = br.readLine().split(" ");
			for(int i = 0; i < n; i++){
				x1 = Integer.parseInt(tmpArray[i]);
				for(int j = i + 1; j < n; j++){
					x2 = Integer.parseInt(tmpArray[j]);
					if(x1 + x2 <= m){
						sum = Math.max(sum, x1 + x2);
					}
				}
			}

			if(sum == -1){
				System.out.println("NONE");
			}
			else {
				System.out.println(sum);
			}
		}
	}

}

