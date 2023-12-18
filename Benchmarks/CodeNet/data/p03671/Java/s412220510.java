import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abc066 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input;
		String[] inputStr;
		long[] num = {0,0,0};
		long tmp, result;
		int i,j;

		try {
			while ((input = br.readLine()) != null) {
				inputStr = input.split(" ");
				num[0] = Long.parseLong(inputStr[0]);
				num[1] = Long.parseLong(inputStr[1]);
				num[2] = Long.parseLong(inputStr[2]);

				for(i=0;i<num.length-1;i++) {
					for(j=1;j<num.length;j++) {
						if(num[i] > num[j]) {
							tmp = num[i];
							num[i] = num[j];
							num[j] = tmp;
							continue;
						}
					}
				}
				result = num[0] + num[1];
				System.out.println(result);
			}
		} catch (IOException e) {
			System.out.println("入出力エラー" + e);
		}

	}

}