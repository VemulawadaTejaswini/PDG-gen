import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		String[] a=vd.readLine().split("");
		String[] b=vd.readLine().split("");
		vd.close();
		if(a[0]==b[2]&&a[1]==b[1]&&a[2]==b[0]) System.out.println("Yes");
		else System.out.println("No");

	}

}
