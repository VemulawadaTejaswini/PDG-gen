import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candy {

	public static void main(String[] args)throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		int sum=0;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(is);

		System.out.print("人数を入力：");

		String str=reader.readLine();


		int N =Integer.parseInt(str);

		for(int i=1;i<=N;i++){
			sum = sum + i;
		}

		System.out.println("必要なキャンディーは："+sum);

	}

}
