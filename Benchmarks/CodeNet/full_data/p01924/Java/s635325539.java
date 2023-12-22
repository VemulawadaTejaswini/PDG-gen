import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String input = br.readLine();

			String[] tmpArray = input.split(" ");
			int t = Integer.parseInt(tmpArray[0]);
			int d = Integer.parseInt(tmpArray[1]);
			int l = Integer.parseInt(tmpArray[2]);

			if(t == 0 && d == 0 && l == 0){
				break;
			}

			int tide[] = new int[t];

			for(int i = 0; i < t; i++){
				tide[i] = Integer.parseInt(br.readLine());
			}

			int result = 0;
//			int begin = Integer.MIN_VALUE;
			int end = Integer.MIN_VALUE;
			boolean dry[] = new boolean[t];
			for(int i = 1; i < t; i++){
				//明らかに洪水が到達している場合
				if(tide[i - 1] >= l){
					//beginの更新が必要
					if(i == 0 || dry[i - 1]){
//						begin = i;
					}

					end = i - 1;
				}
				//洪水は到達していないが濡れている場合
				else if(i <= end + d){

				}
				//それ以外
				else {
					dry[i] = true;
				}

//				System.out.println("i = "+i+" end "+end);
			}

			for(int i = 1; i < t; i++){
				if(!dry[i]){
					result++;
				}
			}

			System.out.println(result);
		}
	}

}

