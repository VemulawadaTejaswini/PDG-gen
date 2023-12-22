import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine();
		String[] strNumArray = strNum.split(" ");
		Integer a = Integer.parseInt(strNumArray[0]);
		Integer b = Integer.parseInt(strNumArray[1]);
		if (a > b) {
			System.out.println("a > b");
		} else if (a < b) {
			System.out.println("a < b");
		} else {
			System.out.println("a == b");
		}
	}

}