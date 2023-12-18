import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader cd = new BufferedReader(new InputStreamReader(System.in));
		String[] vd = cd.readLine().split(" ");
		int a = Integer.parseInt(vd[0]);
		int b = Integer.parseInt(vd[1]);
		
		if(a<=8&&b<=8) System.out.println("Yay!");
		else System.out.println(":(");
	}

}
