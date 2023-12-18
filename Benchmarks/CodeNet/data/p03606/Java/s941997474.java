import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		BufferedReader ok = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(ok.readLine());
		int sum=0;
		
		for(int i=0;i<n;i++) {
			String[] ki = new String[2];
			ki=ok.readLine().split(" ");
			int k = Integer.parseInt(ki[0]);
			int r = Integer.parseInt(ki[1]);
			sum=sum+k-r;
		}
		System.out.println(sum);
	}

}
