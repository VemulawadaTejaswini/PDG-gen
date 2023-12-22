import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Payment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int bills = (n / 1000) + 1;
		System.out.println((bills * 1000) - n);
	}

}
