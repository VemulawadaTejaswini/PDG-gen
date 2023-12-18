import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		String[] cd = vd.readLine().split("");
		int n=0;
		for(int i=0;i<cd.length;++i) {
			if(Integer.parseInt(cd[i])==1) n++;
		}
		System.out.println(n);
	}

}
