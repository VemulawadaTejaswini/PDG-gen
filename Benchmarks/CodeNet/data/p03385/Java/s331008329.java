import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));

		String[] cd = vd.readLine().split("");

		if(cd[0]!=cd[1]&&cd[2]!=cd[1]&&cd[0]!=cd[2]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
