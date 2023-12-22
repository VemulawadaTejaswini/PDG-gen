
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			int low = -1_000_000_003;
			int high = 1_000_000_003;
			final int x = Integer.MIN_VALUE;

			String[] tmpArray = br.readLine().split(" ");
			int input[] = new int[n];
			for(int i = 0; i < n; i++){
				if(tmpArray[i].equals("x")){
					input[i] = x;
				}
				else {
					input[i] = Integer.parseInt(tmpArray[i]);
				}
			}

			int xCount = 0;
			boolean fault = false;
			for(int i = 0; i < n; i++){
//				System.out.println(low + " "+ high);
				if(input[i] == x){
					if(i != n - 1 && input[i + 1] == x){
						fault = true;
						break;
					}

					if(i % 2 == 1){
						if(i != n - 1){
							low = Math.max(low, input[i + 1]);
						}
						low = Math.max(low, input[i - 1]);
					}
					else {
						if(i != n - 1){
							high = Math.min(high, input[i + 1]);
						}
						if(i != 0){
							high = Math.min(high, input[i - 1]);
						}
					}
//					xCount++;
					continue;
				}

				if(i % 2 == 0){
					if(i != n - 1 && input[i + 1] != x && input[i] >= input[i + 1]){
						fault = true;
						break;
					}
				}
				else {
					if(i != n - 1 && input[i + 1] != x && input[i] <= input[i + 1]){
						fault = true;
						break;
					}
				}
			}
//			System.out.println("loop has ended "+ low + " "+ high);

			if(fault){
				System.out.println("none");
			}
			else if(low + 2 == high){
				System.out.println(low + 1);
			}
			else if(high - low <= 1){
				System.out.println("none");
			}
			else {
				System.out.println("ambiguous");
			}

		}
	}

}

