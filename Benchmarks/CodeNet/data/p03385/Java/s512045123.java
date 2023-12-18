import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));

		String cd = vd.readLine();

		if(cd=="abc"||cd=="acb"||cd=="bca"||cd=="bac"||cd=="cab"||cd=="cba") {
			System.out.println("Yes");
		}else {
          System.out.println("No");
        }
    }

}
