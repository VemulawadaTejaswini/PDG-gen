import java.io.BufferedReader;
import java.io.InputStreamReader;

class MainClass {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		System.out.println(num);
	}

}