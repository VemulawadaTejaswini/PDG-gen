import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC095A {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strList = str.split("");
		int ans = 700;
		if(strList[0] == "o"){
			ans += 100;
		}
		if(strList[1] == "o"){
			ans += 100;
		}
		if(strList[2] == "o"){
			ans += 100;
		}
		System.out.println(ans);
	}
}
