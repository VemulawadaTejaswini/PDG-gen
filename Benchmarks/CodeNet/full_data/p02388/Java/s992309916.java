import java.io.*

public class Main {
	public static void main(String args[]) {
	System.out.println("数字を入力してください");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String line = reader.readLine();
	int x = Integer.paraseInt(line);
    int ans = x * x* x;
    System.out.println(ans);
	}
}

