import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strThreeNum = br.readLine();
		Integer a = Integer.parseInt(strThreeNum.split(" ")[0]);
		Integer b = Integer.parseInt(strThreeNum.split(" ")[1]);
		Integer c = Integer.parseInt(strThreeNum.split(" ")[2]);
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}