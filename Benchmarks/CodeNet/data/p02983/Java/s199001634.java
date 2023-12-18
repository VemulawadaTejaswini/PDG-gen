import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String[] tmpArray = br.readLine().split(" ");

		long l = Integer.parseInt(tmpArray[0]);
		long r = Integer.parseInt(tmpArray[1]);

//		l %= 2019;
//		r %= 2019;

//		if(r <= l){
//			r += 2019;
//		}

		int result = 2019;
		for(long i = l; i < r ; i++){
			result = Math.min(result, (int)((i*(i+1))%2019));
		}

		System.out.println(result);

	}

}
